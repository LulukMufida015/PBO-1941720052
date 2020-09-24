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
public class MainTugas {
    public static void main(String[] args) {
        Wahana wahana = new Wahana("RollCoster");
        Pegawai pegawai = new Pegawai("Budi", "123", "085232818530");
        wahana.setPegawai(pegawai);
        Penumpang penumpang = new Penumpang("Luluk", 20,"Bangil");       
        Tiket tiket = new Tiket(20000);
        penumpang.setTiket(tiket);
        Ronde ronde = new Ronde("AB", 10);
        ronde.setPenumpang(penumpang, 1);
        wahana.setRonde(ronde);
        System.out.println(wahana.info());
    }
}
