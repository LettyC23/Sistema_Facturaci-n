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
public class Factura {
    
    private String nombreEmpleado;
    private String date;
    private double totalNeto;
    private double total;
    private String id_nombre_cliente;
    private int id_Forma_Pago;
    

    public Factura() {
    }

    public Factura(String nombreEmpleado, String date, double totalNeto, double total, String id_nombre_cliente, int id_Forma_Pago) {
        this.nombreEmpleado = nombreEmpleado;
        this.date = date;
        this.totalNeto = totalNeto;
        this.total = total;
        this.id_nombre_cliente = id_nombre_cliente;
        this.id_Forma_Pago = id_Forma_Pago;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getId_nombre_cliente() {
        return id_nombre_cliente;
    }

    public void setId_nombre_cliente(String id_nombre_cliente) {
        this.id_nombre_cliente = id_nombre_cliente;
    }

    public int getId_Forma_Pago() {
        return id_Forma_Pago;
    }

    public void setId_Forma_Pago(int id_Forma_Pago) {
        this.id_Forma_Pago = id_Forma_Pago;
    }

    @Override
    public String toString() {
        return "Factura{" + "nombreEmpleado=" + nombreEmpleado + ", date=" + date + ", totalNeto=" + totalNeto + ", total=" + total + ", id_nombre_cliente=" + id_nombre_cliente + ", id_Forma_Pago=" + id_Forma_Pago + '}';
    }

    
    
    
}
