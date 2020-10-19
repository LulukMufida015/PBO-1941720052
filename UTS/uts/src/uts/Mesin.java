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

    public Mesin(String merek) {
        this.merek = merek;
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
    public void tambahKecepatan(){
        if(merek == "Honda"){
            kecepatan =+ 10;
        } else if(merek == "Yamaha"){
            kecepatan =+ 15;
        }
    }
    public void kurangiKecepatan(){
        if(merek == "Honda"){
            kecepatan =- 5;
        } else if(merek == "Yamaha"){
            kecepatan =- 10;
        }
    }
}
