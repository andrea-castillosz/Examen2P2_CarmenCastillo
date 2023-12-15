/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author casti
 */
public class Carro implements Serializable{
    
    private static final long SerialVersionUID=777L;
    
    private Date FechaFabric;
    private String Marca;
    private String Modelo;
    private String PaisR;
    private Color Color;
    private double Precio;
    private ArrayList <Partes> Mejoras = new ArrayList();
    private boolean Marcador;
    private double Horsepower;
    private double VelPunta;
    private double Tiempo;
    private double Tiempo2;

    public Carro() {
    }

    public Carro(Date FechaFabric, String Marca, String Modelo, String PaisR, Color Color, double Precio, boolean Marcador, double Horsepower, double VelPunta, double Tiempo, double Tiempo2) {
        this.FechaFabric = FechaFabric;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.PaisR = PaisR;
        this.Color = Color;
        this.Precio = Precio;
        this.Marcador = Marcador;
        this.Horsepower = Horsepower;
        this.VelPunta = VelPunta;
        this.Tiempo = Tiempo;
        this.Tiempo2 = Tiempo2;
    }

    public Date getFechaFabric() {
        return FechaFabric;
    }

    public void setFechaFabric(Date FechaFabric) {
        this.FechaFabric = FechaFabric;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPaisR() {
        return PaisR;
    }

    public void setPaisR(String PaisR) {
        this.PaisR = PaisR;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public ArrayList<Partes> getMejoras() {
        return Mejoras;
    }

    public void setMejoras(ArrayList<Partes> Mejoras) {
        this.Mejoras = Mejoras;
    }

    public boolean isMarcador() {
        return Marcador;
    }

    public void setMarcador(boolean Marcador) {
        this.Marcador = Marcador;
    }

    public double getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(double Horsepower) {
        this.Horsepower = Horsepower;
    }

    public double getVelPunta() {
        return VelPunta;
    }

    public void setVelPunta(double VelPunta) {
        this.VelPunta = VelPunta;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }

    public double getTiempo2() {
        return Tiempo2;
    }

    public void setTiempo2(double Tiempo2) {
        this.Tiempo2 = Tiempo2;
    }
    
        
    public String validMarcador(boolean marc) { //es reconstruido o comprado
        if (marc == true) {
            return "Es reconstruido.";
        } else {
            return "Es comprado.";
        }
    }
    
    @Override
    public String toString() {
        String cad = "";
        cad += "Carros:\n" + "Marca: " + Marca + "\nModelo: " + Modelo + "\nColor: " + Color + "\nPrecio: " + Precio + "\nMarcador: " + validMarcador(Marcador);
        
        return cad;
    }
    
    
}
