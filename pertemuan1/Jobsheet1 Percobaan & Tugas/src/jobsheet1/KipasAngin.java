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
public class KipasAngin{
    private String merek, jenis;
    private int kecepatan;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setJenis(String newValue){
        jenis = newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void kurangiKecepatan(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cekStatusInfo(){
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + jenis);
        System.out.println("Kecepatan: " + kecepatan);
    }
}
