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
public class Buku extends MediaInformasi{    

    @Override
    public void setJmlHalaman(int jml) {
        System.out.println("Buku ini memiliki : "+jml+" halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari Buku tersebut : "+(jml+4)+" halaman.");
    }
    @Override
    public void reputasi(){
        System.out.println("Penerbit buku ini bereputasi");
    }
}
