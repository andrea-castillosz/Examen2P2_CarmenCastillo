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
public class Circuitos implements Serializable{
    
    private static final long SerialVersionUID=777L;
    
    private double Longitud;
    private String Location;
    private String TipodCarrera;
    private int CantCurvas;

    public Circuitos() {
    }

    public Circuitos(double Longitud, String Location, String TipodCarrera, int CantCurvas) {
        this.Longitud = Longitud;
        this.Location = Location;
        this.TipodCarrera = TipodCarrera;
        this.CantCurvas = CantCurvas;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getTipodCarrera() {
        return TipodCarrera;
    }

    public void setTipodCarrera(String TipodCarrera) {
        this.TipodCarrera = TipodCarrera;
    }

    public int getCantCurvas() {
        return CantCurvas;
    }

    public void setCantCurvas(int CantCurvas) {
        this.CantCurvas = CantCurvas;
    }

    @Override
    public String toString() {
        return "Circuitos{" + "Longitud=" + Longitud + ", Location=" + Location + ", TipodCarrera=" + TipodCarrera + ", CantCurvas=" + CantCurvas + '}';
    }
    
    
    
}
