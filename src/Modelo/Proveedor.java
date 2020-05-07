/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author tmx
 */
public class Proveedor {
    private String nombreProveedor;
    private String nombreEmpresa;
    private String direccion;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(String nombreProveedor, String nombreEmpresa, String direccion, String telefono) {
        this.nombreProveedor = nombreProveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nombreProveedor=" + nombreProveedor + ", nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
