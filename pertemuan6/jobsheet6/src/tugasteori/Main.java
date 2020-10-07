/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasteori;

/**
 *
 * @author Windows 10
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();

        pp.lebar = 12; 
        pp.panjang = 8;       
        lingkaran.r = 10;
        segitiga.alas = 15;
        segitiga.tinggi = 8;
              
        bd.luas(pp.panjang, pp.lebar, lingkaran.r ,segitiga.tinggi, segitiga.alas);       
        System.out.println("");
        bd.keliling(pp.panjang, pp.lebar, lingkaran.r);
        segitiga.keliling();
    }
}