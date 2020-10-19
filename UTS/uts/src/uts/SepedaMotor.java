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
public class SepedaMotor {
    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor(String merekMotor, String merekMesin) {
        this.mesin = mesin;
        this.merekMotor = merekMotor;
    }

    public SepedaMotor(Mesin mesin, String merekMotor) {
        this.mesin = mesin;
        this.merekMotor = merekMotor;
    }
    
    public String getMerekMesin(){
        return mesin.getMerek();
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    public void tambahKecepatanMotor(){
        mesin.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        mesin.kurangiKecepatan();
    }
}
