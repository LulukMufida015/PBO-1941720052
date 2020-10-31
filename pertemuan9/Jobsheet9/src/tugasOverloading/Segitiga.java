/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasOverloading;

/**
 *
 * @author Windows 10
 */
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
        return c;
    }
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println(sg.totalSudut(80));
        System.out.println(sg.totalSudut(45, 90));
        System.out.println(sg.keliling(15, 8, 6));
        System.out.println(sg.keliling(16, 6));
    }
}
