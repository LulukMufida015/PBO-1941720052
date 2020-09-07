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
public class BarangMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Barang brg = new Barang();
        System.out.println("------------------------------------");
        System.out.println("        MASUKKAN DATA BARANG        ");
        System.out.println("------------------------------------");
        System.out.print("Masukkan kode : ");
        brg.kode = luluk.nextLine();
        System.out.print("Masukkan nama barang : ");
        brg.namaBarang = luluk.nextLine();
        System.out.print("Masukkan harga dasar : ");
        brg.hargaDasar = mufida.nextInt();
        System.out.print("Masukkan diskon : ");
        brg.diskon = input.nextFloat();
        System.out.println();
        brg.hitungHargaJual();
        brg.tampilData();
    }
    
}
