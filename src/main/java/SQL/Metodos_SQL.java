/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import SQL.Conexion_BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tmx
 */
public class Metodos_SQL {
    
    private static  Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resulSet;
    
    public void guardar_datos_empleado (String id_Empleado, String nombre, String primerAp, 
            String segundoAp, String telefono, String fechaNac, 
            int salario, String horario){
    
        try {
            conexion = Conexion_BD.conectar();
            String consulta = "INSERT INTO Empleados (id_Empleado, nombre, primerAp, segundoAp, telefono, fechaNac,"
                    + "salario,horario) VALUES (?,?,?,?,?,?,?,?)";
            //PreparedStatement sentencia_preparada = conexion.prepareStatement(consulta);
            
            //System.out.println(id_Empleado);
            
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, id_Empleado);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, primerAp);
            sentencia_preparada.setString(4, segundoAp);
            sentencia_preparada.setString(5, telefono);
            sentencia_preparada.setString(6, fechaNac);
            sentencia_preparada.setInt(7, salario);
            sentencia_preparada.setString(8, horario);
            sentencia_preparada.executeUpdate();
            
            //ResultSet rs = sentencia_preparada.executeQuery();
            int i = sentencia_preparada.executeUpdate();
            
            if(i>0){
                JOptionPane.showMessageDialog(null, "Datos guardados");
                System.out.println("SQL.Metodos_SQL.guardar_datos_empleado()");
            }else{       
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }
            conexion.close();
            } catch (Exception e) {
                System.out.println("Error" + e);
        }finally{
            
        }
}
    
    
    public void eliminarEmpleado(String id_Empleado){
        try {
            conexion =Conexion_BD.conectar();
            String sqlEliminar ="SELECT * FROM Empleados WHERE id_Empleado =?";
            sentencia_preparada = conexion.prepareStatement(sqlEliminar);
            sentencia_preparada.setString(1, id_Empleado);
            resulSet = sentencia_preparada.executeQuery();
            if(resulSet.next()){
                
            }
        } catch (Exception e) {
        }
    }
}
