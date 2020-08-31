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
public class Kerudung extends Baju{
    private String jenisBahan, bentuk;
    
    public void setJenisBahan(String newValue){
        jenisBahan = newValue;
    }
    public void setBentuk(String newValue){
        bentuk = newValue;
    }
    public void cetakStatusInfo(){
        super.cetakStatusInfo();
        System.out.println("Jenis Bahan: " + jenisBahan);
        System.out.println("Bentuk: " + bentuk);
    }
}
