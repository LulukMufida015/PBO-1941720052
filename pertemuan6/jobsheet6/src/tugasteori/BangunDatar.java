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
public class BangunDatar {
    public float luas(float p, float l, float r, float a, float t) {
        float luas;
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        System.out.println("Luas Lingkaran : ");
        System.out.println(luas = (float) (3.14 * r * r));
        System.out.println("Luas Persegi Panjang : ");
        System.out.println(luas = p * l);
        System.out.println("Luas Segitiga : ");
        System.out.println(luas = (float) (0.5 * a * t));
        return luas;
    }

    public float keliling(float p, float l, float r) {
        float keliling;
        System.out.println("MENGHITUNG KELILING BANGUN DATAR");
        System.out.println("Keliling Lingkaran : ");
        System.out.println(keliling = (float) (2 * 3.14 * r));
        System.out.println("Keliling Persegi Panjang : ");
        System.out.println(keliling = 2 * (p + l));
        return keliling;
    }
}
