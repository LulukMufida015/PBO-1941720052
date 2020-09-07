/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Windows 10
 */
public class Peminjaman {
    public String id, namaMember, namaGame;
    public int harga;
    
    public void dataPeminjaman(){
        System.out.println("-------------------------------");
        System.out.println("    DATA HASIL PEMINJAMAN");
        System.out.println("-------------------------------");
        System.out.println("id peminjam: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga Total: " + harga);
    }
    
    public void hargaBayar(int lamaSewa){
        harga = harga * lamaSewa;
    }
    
}
