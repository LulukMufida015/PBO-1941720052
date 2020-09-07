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
public class Lingkaran {
    public double phi, r;
    
    public double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
}
