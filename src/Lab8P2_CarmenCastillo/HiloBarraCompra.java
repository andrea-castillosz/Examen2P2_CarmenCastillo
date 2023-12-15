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
public class HiloBarraCompra extends Thread {

    private JProgressBar barraComp;
    private Carro car;
    private boolean vive;

    public HiloBarraCompra() {
    }

    public HiloBarraCompra(JProgressBar barraComp, Carro car) {
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
        
        while (vive) {
            barraComp.setString("Precio: " + car.getPrecio());
            barraComp.setValue(barraComp.getValue() + 1);

            if (barraComp.getValue() == 5) {
                vive = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

        }
        barraComp.setValue(0);
        barraComp.setString("");
        JOptionPane.showMessageDialog(null, "Carro comprado!");

    }

}
