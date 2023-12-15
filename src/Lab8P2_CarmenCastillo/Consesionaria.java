/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class Consesionaria implements Serializable{
    
    private static final long SerialVersionUID=777L;

    private String Nombre;
    private String Locación;
    private ArrayList<Carro> ListCarro = new ArrayList();

    public Consesionaria() {
    }
        
    public Consesionaria(String nombre, String locación) {
        this.Nombre = nombre;
        this.Locación = locación;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getLocación() {
        return Locación;
    }

    public void setLocación(String locación) {
        this.Locación = locación;
    }

    public ArrayList<Carro> getListCarro() {
        return ListCarro;
    }

    public void setListCarro(ArrayList<Carro> ListCarro) {
        this.ListCarro = ListCarro;
    }
    
    
    
}
