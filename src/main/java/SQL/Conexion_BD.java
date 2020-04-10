/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tmx
 */
public class Conexion_BD {
  
   	private Connection conexion;
	private Statement stm;
	
	private PreparedStatement pstm ; 
	
	ResultSet rs=null;
	
	public Conexion_BD() {
		try {
			Class.forName("com.mysql.cj.jdbc.DB2Driver");
									 //127.0.0.1 
			String url = "jdbc:mysql://localhost:50000/Desec";
			conexion = DriverManager.getConnection(url, "db2adminL", "EStrell24");//(ruta, nombreUsuario, contraseña)
			System.out.println("Conexion establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro el controlador");
		
		}catch(SQLException e) {
			System.out.println("No se pudo conectar al servidor");
			
		}finally {
			//Codigo que SIEMPRE SE EJECUTA 
			//Cierre de la conexion de la BD
		}
	}//Cnstructor
	
	public void cerrarConexion() {
		try {
			stm.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println("No se pudo cerrar la conexion");
		}
        }
        
        
        public boolean ejecutarInstruccion(Empleado e) {
		try {
			
	
			String sql =  "INSERT INTO Empleados (Nombres,PrimerAP,SegundoAp,Teléfono,FechaNacimiento,Salario,Horario) VALUES(?,?,?,?,?,?,?);";
			PreparedStatement pstm = conexion.prepareStatement(sql);
			pstm.setString(1, e.getNombre());
			pstm.setString(2, e.getPrimerAp());
			pstm.setString(3, e.getSegundoAp());
			pstm.setString(4, e.getTelefono());
			pstm.setString(5, e.getFechaNac());
			pstm.setInt(6, e.getSueldo());
			pstm.setString(7, e.getHorario());
			
		
			String sql1= "SELECT * FROM Empleados WHERE Nombres = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
			pstm1.setString(1, e.getNombre());
			
			
			int ejecucion;
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
			
		} catch (SQLException e1) {
		System.out.println("No se pudo ejecutar la instruccion SQL");
		return false;
		}
	}
}
