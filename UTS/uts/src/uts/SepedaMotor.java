/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Windows 10
 */
public class SepedaMotor extends Mesin{
   private Mesin mesin;
   private String merekMotor;

    public SepedaMotor(String merekMotor, String merekMesin) {
        this.merekMotor = merekMotor;
        super.setMerek(merekMesin);
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String MerekMotor) {
        this.merekMotor = MerekMotor;
    }
   
   public String getMerekMesin() {
        return super.getMerek();
    }
   public void tambahKecepatanMotor(){
       String merk =getMerekMesin();
       if (merk.equalsIgnoreCase("Honda")){
           super.tambahkecepatan(10);
       }
       else if (merk.equalsIgnoreCase("Yamaha")){
           super.tambahkecepatan(15);
       }
       System.out.println(super.getKecepatan()+" Km/jam");
   }
   public void kurangiKecepatanMotor(){
       String merk =getMerekMesin();
       if (merk.equalsIgnoreCase("Honda")){
           super.kurangiKecepatan(5);
       }
       else if (merk.equalsIgnoreCase("Yamaha")){
           super.kurangiKecepatan(10);
       }
       System.out.println(super.getKecepatan()+" Km/jam");
   }
}