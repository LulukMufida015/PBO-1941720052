/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Perkalianku {
    // latihan 4.1
//    void perkalian(int a, int b){
//        System.out.println(a * b);
//    }
//    void perkalian(int a, int b, int c){
//        System.out.println(a * b * c);
//    }
//    public static void main(String[] args) {
//        Perkalianku objek = new Perkalianku();
//        
//        objek.perkalian(25, 43);
//        objek.perkalian(34, 23, 56);
//    }
    
    //latihan 4.3
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(double a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Perkalianku objek = new Perkalianku();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
