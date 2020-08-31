/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author Windows 10
 */
public class Tugas1 {
    public static void main(String[] args) {
        Baju bj = new Baju();
        Kerudung krdg = new Kerudung();
        Selimut slmt = new Selimut();
        KipasAngin ka = new KipasAngin();
        TV tv = new TV();
        
        System.out.println("BAJU");
        bj.setWarna("Tosca");
        bj.tambahPanjang(5);
        bj.tambahLebar(3);
        bj.cetakStatusInfo();
        
        System.out.println("KERUDUNG");
        krdg.setWarna("Moca");
        krdg.setBentuk("Persegi panjang");
        krdg.setJenisBahan("Ceruty");
        krdg.tambahLebar(2);
        krdg.tambahPanjang(3);
        krdg.cetakStatusInfo();
        
        System.out.println("SELIMUT");
        slmt.setWarna("Merah");
        slmt.setMotif("Bunga-bunga");
        slmt.setKetebalan(3);
        slmt.tambahLebar(4);
        slmt.tambahPanjang(5);
        slmt.cekStatusInfo();
        
        System.out.println("KIPAS ANGIN");
        ka.setMerek("Matsunichi");
        ka.setJenis("Berdiri");
        ka.tambahKecepatan(2);
        ka.cekStatusInfo();
        
        System.out.println("TV");
        tv.setLCD("LED TV");
        tv.tambahVolume(6);
        tv.setUkuran(24);
        tv.cekStatusInfo();
        
    }
    
}
