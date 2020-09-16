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
public class Koperasi {
    private String noKTP;
    private String nama;
    private int saldo;
    private int limitPinjam = 5000000;
    public int jumlahPinjam;

    public Koperasi(String noKTP, String nama, int saldo) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimitPinjam() {
        return limitPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setLimitPinjam(int limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    
    
    public int pinjam(int pinjam){
        if (pinjam < limitPinjam){
          jumlahPinjam += pinjam;
        }
        else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }  
        return jumlahPinjam;
    }
    
    public int angsur(int angsur){
        if(angsur > ((jumlahPinjam * 10) /100)){
            jumlahPinjam -= angsur;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjam");
        }
        
    return jumlahPinjam;
    }
}
