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
import java.util.Scanner;
public class Barang {
    Scanner luluk = new Scanner(System.in);
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        int hargaJual = hargaDasar - ((int)diskon * hargaDasar/100);
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("----------------------------");
        System.out.println("        DATA BARANG         ");
        System.out.println("----------------------------");
        System.out.println("Kode : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon yang didapat: " + diskon);
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
    
}
