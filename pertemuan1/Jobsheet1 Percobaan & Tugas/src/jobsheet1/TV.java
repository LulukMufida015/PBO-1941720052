/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author Windows 10
 */
public class TV {
    private String LCD;
    private int volume, ukuran;
    
    public void setLCD(String newValue){
        LCD = newValue;
    }
    public void setUkuran(int newValue){
        ukuran = newValue;
    }
    public void tambahVolume(int increment){
        volume = volume + increment;
    }
    public void kurangVolume(int decrement){
        volume = volume + decrement;
    }
    public void cekStatusInfo(){
        System.out.println("Jenis LCD: " + LCD);
        System.out.println("Volume: " + volume);
        System.out.println("Ukuran(inch): " + ukuran);
    }
}
