/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.io.Serializable;

/**
 *
 * @author casti
 */
public class Partes implements Serializable{
    
    private static final long SerialVersionUID=777L;
    
    private String Marca;
    private String Clasificacion;
    private double Precio;

    public Partes() {
    }

    public Partes(String marca, String clasificacion, double precio) {
        this.Marca = marca;
        this.Clasificacion = clasificacion;
        this.Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.Clasificacion = clasificacion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    @Override
    public String toString() {
        return "Parte{" + "marca=" + Marca + ", clasificacion=" + Clasificacion + ", precio=" + Precio + '}';
    }
    
}
