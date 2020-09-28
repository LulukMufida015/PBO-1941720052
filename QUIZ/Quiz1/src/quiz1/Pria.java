/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Windows 10
 */
public class Pria extends Manusia {

    private Wanita istri;

    Pria(){
        
    }
    
    Pria(int umur, String nama, boolean dewasa, Wanita istri){
        setUmur(umur);
        setNama(nama);
        setDewasa(dewasa);
        this.istri = istri;
    }

    public boolean ketentuan(int umur){
        if (umur >= 22) {
            return true;
        } else {
            return false;
        }
    }
    
    public void info(int umur){
        System.out.println("Info Pria :");
        super.info();
        if (isDewasa() == true) {
            System.out.println("Info Istri");
            if (istri.ketentuan(umur) == true) {
                istri.info();
                System.out.println("Status : Bersuami");
            } else {
                istri.info();
            }
        } else {
            System.out.println("Status : Masih Kuliah");
        }
    }
}
