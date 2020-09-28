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
public class Wanita extends Manusia{
    private Manusia anak;
    private Pria suami;

    Wanita() {

    }

    Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak) {
        setUmur(umur);
        setNama(nama);
        setDewasa(dewasa);
        this.suami = suami;
        this.anak = anak;
    }
    
    public boolean ketentuan(int umur) {
        if (umur >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public void info(int umur) {
        System.out.println("INFO WANITA : ");
        super.info();
        if (isDewasa() == true) {
            System.out.println("INFO SUAMI : ");
            if (suami.ketentuan(umur) == true) {
                suami.info();
                System.out.println("Status : Beristri");
            } else {
                suami.info();
            }
        } else {
            System.out.println("Status : Masih Kuliah");
        }
    }
}
