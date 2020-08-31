/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author Windows 10 
 */
public class Selimut extends Baju{
    private String motif;
    private int ketebalan;
    
    public void setMotif(String newValue){
        motif = newValue;
    }
    public void setKetebalan(int newValue){
        ketebalan = newValue;
    }
    public void cekStatusInfo(){
        super.cetakStatusInfo();
        System.out.println("Motif: " + motif);
        System.out.println("Ketebalan(cm): " + ketebalan);
    }
    
}
