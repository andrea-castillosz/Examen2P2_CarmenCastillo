/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8P2_CarmenCastillo;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author casti
 */
public class HiloSimulacion extends Thread{
    
    private Random ran = new Random();
    private int Ran1Bar;
    private int Ran2Bar;
    int HPin;
    
    double HP;
    double HP2;
    int disCir;
    JProgressBar Carro1;   
    JProgressBar Carro2;  
    boolean vive ;

    public HiloSimulacion(double HP, int disCir, JProgressBar Carro1, JProgressBar Carro2, double HP2) {
        this.HP = HP;
        this.HP2 = HP2;
        this.disCir = disCir;
        this.Carro1 = Carro1;
        this.Carro2 = Carro2;
        this.vive = true;
    }

    public Random getRan() {
        return ran;
    }

    public void setRan(Random ran) {
        this.ran = ran;
    }

    public int getRan1Bar() {
        return Ran1Bar;
    }

    public void setRan1Bar(int Ran1Bar) {
        this.Ran1Bar = Ran1Bar;
    }

    public int getRan2Bar() {
        return Ran2Bar;
    }

    public void setRan2Bar(int Ran2Bar) {
        this.Ran2Bar = Ran2Bar;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public int getDisCir() {
        return disCir;
    }

    public void setDisCir(int disCir) {
        this.disCir = disCir;
    }

    public JProgressBar getCarro1() {
        return Carro1;
    }

    public void setCarro1(JProgressBar Carro1) {
        this.Carro1 = Carro1;
    }

    public JProgressBar getCarro2() {
        return Carro2;
    }

    public void setCarro2(JProgressBar Carro2) {
        this.Carro2 = Carro2;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getHP2() {
        return HP2;
    }

    public void setHP2(double HP2) {
        this.HP2 = HP2;
    }
    
    
    
    @Override
    public void run() {
        while(vive) {
            Ran1Bar = ran.nextInt(100) + 50;
            Ran2Bar = ran.nextInt(100) + 50;
            Carro1.setMaximum(disCir);
            Carro2.setMaximum(disCir);
            Ran1Bar = Ran1Bar / 100;
            Ran2Bar = Ran1Bar / 100;
            HP = HP * Ran1Bar;
            HP2 = HP2 * Ran2Bar;
            
        }
    }
    
}
