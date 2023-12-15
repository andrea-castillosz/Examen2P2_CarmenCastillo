/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author casti
 */
public class HilosInicio extends Thread {

    private JProgressBar barrauser;
    private JProgressBar barracontra;
    private int maxU;
    private int maxC;
    private boolean vive;
    private JFrame main;
    private JDialog drama;

    public HilosInicio() {
    }

    public HilosInicio(JProgressBar barrauser, JProgressBar barracontra, int maxU, int maxC, JFrame main ,JDialog drama) {
        this.barrauser = barrauser;
        this.barracontra = barracontra;
        this.maxU = maxU;
        this.maxC = maxC;
        this.main = main;
        this.drama = drama;
        vive = true;
    }

    public JProgressBar getBarrauser() {
        return barrauser;
    }

    public void setBarrauser(JProgressBar barrauser) {
        this.barrauser = barrauser;
    }

    public JProgressBar getBarracontra() {
        return barracontra;
    }

    public void setBarracontra(JProgressBar barracontra) {
        this.barracontra = barracontra;
    }

    public int getMaxU() {
        return maxU;
    }

    public void setMaxU(int maxU) {
        this.maxU = maxU;
    }

    public int getMaxC() {
        return maxC;
    }

    public void setMaxC(int maxC) {
        this.maxC = maxC;
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
            barrauser.setValue(barrauser.getValue() + 1);
            barracontra.setValue(barracontra.getValue() + 1);
            
            if (barrauser.getValue() == maxU && barracontra.getValue() == maxC) {
                vive = false;
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

        } 
        drama.pack();
        drama.setLocationRelativeTo(null);
        main.setVisible(false);
        drama.setVisible(true);
        barracontra.setValue(0);
        barrauser.setValue(0);

    }

}
