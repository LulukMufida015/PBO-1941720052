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
public class Wahana {
    private String nama;
    private Pegawai pegawai;
    private Ronde ronde;

    public Wahana(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Ronde getRonde() {
        return ronde;
    }

    public void setRonde(Ronde ronde) {
        this.ronde = ronde;
    }
    public String info(){
        String info = "";
        info += "WAHANA\nNama: " + nama + "\n";
        System.out.println();
        info += "PEGAWAI " + pegawai.info() + "\n";
        System.out.println();
        info += "RONDE " + ronde.info() + "\n";
        return info;
    }
}
