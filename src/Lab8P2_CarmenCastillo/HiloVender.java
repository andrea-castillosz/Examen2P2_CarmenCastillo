/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casti
 */
public class HiloVender extends Thread{
    
     private DefaultTableModel modelo;
//    private Object[] row;
    private ArrayList<Carro> listCarUser;
    private boolean vive;
    private boolean esrec;

    public HiloVender() {
    }

    public HiloVender(DefaultTableModel modelo, ArrayList<Carro> listCarUser) {
        this.modelo = modelo;
        this.listCarUser = listCarUser;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        //while (vive) {
        modelo.setRowCount(0); //es rolita maje me recuerda mis tiempos felices
        for (Carro c : listCarUser) { //si
            esrec = c.isMarcador();
            Object[] row = {c.getMarca(), c.getModelo(), c.getColor(), c.getFechaFabric(), c.validMarcador(esrec)};
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            modelo.addRow(row);
        }
        //} 
    }
    
}
