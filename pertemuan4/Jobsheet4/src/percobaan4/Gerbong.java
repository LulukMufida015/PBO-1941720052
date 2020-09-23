/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author Windows 10
 */
public class Gerbong {

    private String kode;
    private Kursi arrayKursi[];

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        for (int i = 0; i < arrayKursi.length; i++) {
            if (arrayKursi[i].getPenumpang() == null) {
                this.arrayKursi[i].setPenumpang(penumpang);
                break;
            }
            
        }

        if (arrayKursi[nomor].getPenumpang() != null) {

            System.out.println("Kursi sudah dipesan orang!");

        } else {

            this.arrayKursi[nomor - 1].setPenumpang(penumpang);

        }
//        if(String.valueOf(nomor) == null ? arrayKursi[nomor-1].getNomor() 
//           == null : String.valueOf(nomor).equals(arrayKursi[nomor-1].getNomor())){
//            System.out.println("Kursi sudah dipesan orang!");
//        }else {
//             this.arrayKursi[nomor-1].setPenumpang(penumpang);
//        }

    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
