/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Windows 10
 */
public class Penumpang {
    private String nama;
    private int umur;
    private String alamat;
    private Tiket tiket;

    public Penumpang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }
    public String info(){
        String info = "";
        info += "\nNama: " + nama + "\n";
        info += "Umur: " + umur + "\n";
        info += "Alamat: " + alamat + "\n";
        info += "TIKET " + tiket.info() + "\n";
        return info;
    }
}
