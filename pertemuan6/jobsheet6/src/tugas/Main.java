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
public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen("15001", "Abdul Wahab", "Malang");
        dosen.jumlahSKS = 10;

        Dosen dosen2 = new Dosen("15002", "Zaki Udin", "Surabaya");
        dosen2.jumlahSKS = 14;
        
        Dosen dosen3 = new Dosen("15003", "M. Nufail", "Palembang");
        dosen3.jumlahSKS = 16;

        DaftarGaji dg = new DaftarGaji(3);
        dg.addPegawai(dosen);
        dg.addPegawai(dosen2);
        dg.addPegawai(dosen3);
        dg.printSemuaGaji();
    }
}
