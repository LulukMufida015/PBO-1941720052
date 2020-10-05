/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author Windows 10
 */
public class ClassB extends ClassA{
    private int z;

    public void setZ(int z) {
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai Z: "+ z);
    }
    public void getJumlah(){
        System.out.println("Jumlah: "+ (super.x+super.y+z));
    }
}
