/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import percobaan4.Kursi;

/**
 *
 * @author Windows 10
 */
public class Ronde {
    private String kode;
    private Bangku arrayBangku[];

    public Ronde(String kode, int jumlah) {
        this.kode = kode;
        this.arrayBangku = new Bangku[jumlah];
        this.initBangku();
    }
    public String getKode() {
        return kode;
    }
    private void initBangku(){
        for(int i = 0; i< arrayBangku.length; i++){
            this.arrayBangku[i] = new Bangku(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Bangku[] getArrayBangku() {
        return arrayBangku;
    }

    public void setArrayBangku(Bangku[] arrayBangku) {
        this.arrayBangku = arrayBangku;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        for(int i = 0; i< arrayBangku.length; i++){
            if(arrayBangku[i].getPenumpang() == null){
                this.arrayBangku[i].setPenumpang(penumpang);
                break;
            }
        }
        if(arrayBangku[nomor].getPenumpang() != null){
            System.out.println("Kursi milik orang lain!");
        } else{
            this.arrayBangku[nomor-1].setPenumpang(penumpang);
        }
    }
    public String info(){
        String info = "";
        info += "\nKode: " + kode + "\n";
        for(Bangku bangku : arrayBangku){
            info += bangku.info();
        }
        return info;
    } 
}
