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
public class Baju {
    private String warna;
    private int panjang, lebar;

    public void setWarna(String newValue){
        warna = newValue;
    }
    public void tambahPanjang(int increment){
        panjang = panjang + increment;
    }
    public void tambahLebar(int increment){
        lebar = lebar + increment;
    }
    public void cetakStatusInfo(){
        System.out.println("Warna: " + warna);
        System.out.println("Panjang(cm): " + panjang);
        System.out.println("Lebar(cm): " + lebar);
    }
}
