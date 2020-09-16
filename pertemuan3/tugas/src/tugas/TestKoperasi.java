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
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args){
        Scanner luluk = new Scanner(System.in);
        Koperasi donny = new Koperasi("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjam());

        System.out.print("\nMasukkan jumlah pinjam : ");
        int x = luluk.nextInt();
        donny.pinjam(x);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
        System.out.print("\nMasukkan jumlah angsuran: ");
        int y = luluk.nextInt();
        donny.angsur(y);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
    }
    
}
