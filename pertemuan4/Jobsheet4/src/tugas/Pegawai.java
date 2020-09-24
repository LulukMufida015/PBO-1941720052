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
public class Pegawai {
    private String nama;
    private String id;
    private String noTelp;

    public Pegawai(String nama, String id, String noTelp) {
        this.nama = nama;
        this.id = id;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String info(){
        String info = "";
        info += "\nNama: " + nama + "\n";
        info += "id: " + id + "\n";
        info += "Nomor Telephone: " + noTelp + "\n";
        return info;
    }
}
