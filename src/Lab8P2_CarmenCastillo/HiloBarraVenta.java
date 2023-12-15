/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author casti
 */
public class HiloBarraVenta extends Thread{
    
    private JProgressBar barraComp;
    private Carro car;
    private boolean vive;

    public HiloBarraVenta() {
    }

    public HiloBarraVenta(JProgressBar barraComp, Carro car) {
        this.barraComp = barraComp;
        this.car = car;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        //barraComp.sett
        while (vive) {
            barraComp.setValue(barraComp.getValue() + 1);

            if (barraComp.getValue() == 7) {
                vive = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

        }
        barraComp.setValue(0);
        barraComp.setString("");
        JOptionPane.showMessageDialog(null, "Carro vendido!");

    }
    
}
