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
public class Main {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        System.out.println("=================Pilih Jenis Komputer================");
        System.out.println("1. PC\n2. Laptop");
        System.out.print("Isi disini -> ");
        int pilih = luluk.nextInt();
        if(pilih == 1){
            Pc pc = new Pc("DELL", 4, 8, "Inter core i7", 15);
            pc.tampilPc();
        } else if(pilih == 2){
            System.out.println("Masukkan jenis Laptop");
            System.out.println("1. Mac\n2. Windows");
            System.out.print("Isi disini -> ");
            int lptp = luluk.nextInt();
            if(lptp == 1){
                Mac m = new Mac("MacBook", 4, 8, "Quad-core i7", "Polimer", "Private internet access");
                m.tampilMac();
            } else if(lptp == 2){
                Windows w = new Windows("ASUS", 3, 6, "Intel core i5", "Lithium Ion", "Support Touch & Berbagai Form Factor");
                w.tampilWindows();
            } else{
                System.out.println("Masukan Anda salah!!");
            }
        } else{
            System.out.println("Masukan Anda salah!!");
        }
    }
}
