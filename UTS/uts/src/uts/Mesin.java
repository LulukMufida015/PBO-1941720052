/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Windows 10
 */
public class Mesin {
    private String merek;
    private double kecepatan;

    public Mesin() {
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void tambahkecepatan(double x){
        if (kecepatan <= 100)
        kecepatan += x;
    }
    public void kurangiKecepatan(double x){
        if (kecepatan >= 0)
        kecepatan -= x;
    }
}