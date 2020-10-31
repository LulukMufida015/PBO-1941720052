/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasOverriding;

/**
 *
 * @author Windows 10
 */
public class ManusiaMain {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa(); 
        System.out.println("-------------Manusia-------------");
        man.makan();
        man.bernafas();
        System.out.println();
        System.out.println("-------------Dosen-------------");
        man = dosen;
        man.makan();
        dosen.lembur();
        System.out.println();
        System.out.println("-------------Mahasiswa-------------");
        man = mhs;
        man.makan();
        mhs.tidur();
    }
}
