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
public class LingkaranMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Lingkaran lngkrn = new Lingkaran();
        System.out.println("----------------------------------------------------");
        System.out.println("    MENGITUNG LUAS DAN KELILING LINGKARAN");
        System.out.println("----------------------------------------------------");
        lngkrn.phi = 3.14;
        System.out.println("phi default : " + lngkrn.phi);
        System.out.print("Masukkan jari-jari : ");
        lngkrn.r = luluk.nextDouble();
        System.out.println("Luas Lingkaran : " + lngkrn.hitungLuas());
        System.out.println("Keliling Lingkaran : " + lngkrn.hitungKeliling());
    }
}
