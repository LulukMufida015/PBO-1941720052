/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasteori;

/**
 *
 * @author Windows 10
 */
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    
    public float keliling(){
        double sisi = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
        float keliling = (float) (alas+tinggi+sisi);
        System.out.println("Keliling Segitiga :\n" + keliling);
        return keliling;
    }   
}
