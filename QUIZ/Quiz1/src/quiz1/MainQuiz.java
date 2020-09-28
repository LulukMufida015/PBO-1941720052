/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class MainQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        boolean luar = true;
        while (luar) {
            System.out.println("INFO DATA KELUARGA");
            System.out.print("Masukan Jenis Kelamin (p/l) : ");
            String gender = luluk.nextLine();
            if (gender.equals("p")) {
                Wanita w = new Wanita();
                System.out.print("Masukan nama : ");
                String nama = luluk.nextLine();
                System.out.print("Masukan umur : ");
                int umur = mufida.nextInt();
                if (w.ketentuan(umur) == true) {
                    System.out.println("Masukan data suami");
                    System.out.print("Masukan nama : ");
                    String nama1 = luluk.nextLine();
                    System.out.print("Masukan umur : ");
                    int umur1 = mufida.nextInt();
                    System.out.println("Masukan data anak");
                    System.out.print("Masukan nama : ");
                    String nama2 = luluk.nextLine();
                    System.out.print("Masukan umur : ");
                    int umur2 = mufida.nextInt();
                    Pria p = new Pria();
                    p.setNama(nama1);
                    p.setUmur(umur1);
                    p.setDewasa(p.ketentuan(umur1));
                    Manusia a = new Manusia(umur2, nama2, false);
                    Wanita w1 = new Wanita(umur, nama, w.ketentuan(umur), p, a);
                    w1.info(umur1);
                    System.out.println("info anak : ");
                    a.info();
                } else {
                    Wanita w1 = new Wanita(umur, nama, w.ketentuan(umur), null, null);
                    w1.info(0);
                }
            } else if (gender.equals("l")) {
                Pria p = new Pria();
                System.out.print("Masukan nama : ");
                String nama = luluk.nextLine();
                System.out.print("Masukan umur : ");
                int umur = mufida.nextInt();
                if (p.ketentuan(umur) == true ) {
                    System.out.println("Masukan data istri");
                    System.out.print("Masukan nama : ");
                    String nama1 = luluk.nextLine();
                    System.out.print("Masukan umur : ");
                    int umur1 = mufida.nextInt();
                    Wanita w = new Wanita();
                    w.setNama(nama1);
                    w.setUmur(umur1);
                    w.setDewasa(w.ketentuan(umur1));
                    Pria p1 = new Pria(umur, nama, p.ketentuan(umur), w);
                    p1.info(umur);
                } else {
                    Pria p1 = new Pria(umur, nama, p.ketentuan(umur), null);
                    p1.info(0);
                }
            } else {
                System.out.println("input yang anda masukkan salah!!!");
            }
            boolean ulang = true;
            while(ulang){
                System.out.print("Ulang Program? (y/t) : ");
                String lagi = luluk.nextLine();
                if (lagi.equals("y")) {
                    ulang = false;
                } else if (lagi.equals("t")) {
                    ulang = false;
                    luar = false;
                } else {
                    System.out.println("Input yang Anda masukkan Salah!!!");
                }
            }
        }
    }
}
