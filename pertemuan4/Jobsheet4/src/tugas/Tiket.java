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
public class Tiket {
    private int harga;

    public Tiket(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String info(){
        String info = "";
        info += "\nHarga: " + harga + "\n";
        return info;
    }
}
