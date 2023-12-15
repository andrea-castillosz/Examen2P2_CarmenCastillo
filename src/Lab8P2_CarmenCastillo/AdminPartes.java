/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class AdminPartes {
    
    private ArrayList<Partes> listaPartes = new ArrayList();
    private File archivo = null;
    
    public AdminPartes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partes> getListaPartes() {
        return listaPartes;
    }

    public void setListaPartes(ArrayList<Partes> listaPartes) {
        this.listaPartes = listaPartes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setParte(Partes c){
        listaPartes.add(c);
    }
    
    public void cargarArchivo() {
        try {            
            listaPartes = new ArrayList();
            Partes temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto //BUFFER
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Partes) objeto.readObject()) != null) { //MIENTRAS NO HAYA NULO
                        listaPartes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo); //que el canal apunte al archivo
            bw = new ObjectOutputStream(fw); //que el biffer apunte al canal
            for (Partes t : listaPartes) {
                bw.writeObject(t);
            }
            bw.flush(); //flush de la memoria RAM a ROM
        } catch (Exception ex) {
        } finally { //opcinal, finally es un bloque que siempre se va ejecutar este o no, solo es por elegancia 
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
