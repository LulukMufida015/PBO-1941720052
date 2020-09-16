/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author Windows 10
 */
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();
       
        motor.nyalakanMesin();
        motor.printStatus();
        
        for(int i=0; i<=25; i++){
            motor.tambahKecepatan();
        }     
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
    
}
