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
public class PeminjamanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        Peminjaman pmnjmn = new Peminjaman();
        System.out.println("---------------------------------");
        System.out.println("    MASUKKAN DATA PEMINJAM");
        System.out.println("---------------------------------");
        System.out.print("Masukkan id: ");
        pmnjmn.id = luluk.nextLine();
        System.out.print("Masukkan nama member: " );
        pmnjmn.namaMember = luluk.nextLine();
        System.out.print("Masukkan nama game: ");
        pmnjmn.namaGame = luluk.nextLine();
        System.out.print("Masukkan harga/jam: ");
        pmnjmn.harga = mufida.nextInt();
        System.out.println();
            
        pmnjmn.hargaBayar(3);
        pmnjmn.dataPeminjaman();
        
    }
    
}
