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
public class DaftarGaji {

    public Pegawai listPegawai[];
    public int jumlahPegawaiSekarang = 0;

    public DaftarGaji(int jumlah_pegawai) {
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai p) {
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }

    public void printSemuaGaji() {
        System.out.println("DAFTAR GAJI DOSEN POLITEKNIK NEGERI MALANG");
        for (int i = 0; i < jumlahPegawaiSekarang; i++) {
            System.out.print((i + 1) + ". " + listPegawai[i].getNama() + " mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
