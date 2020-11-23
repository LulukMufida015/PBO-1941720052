/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Windows 10
 */
public abstract class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    private int tahunSekarang;

    
    public abstract void setJmlHalaman(int jml);

    
    public int getTahunSekarang(int tahunSekarang) {
        this.tahunSekarang = tahunSekarang;
        return tahunSekarang;
    }

    @Override
    public void reputasi() {
       
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit : "+alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun : "+tahun+", sehingga penerbit ini sekarang berusia "+(this.tahunSekarang-tahun)+" tahun");
    }  
   
}
