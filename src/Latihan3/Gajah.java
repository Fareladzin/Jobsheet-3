/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Fareladzin Wibi
 */
public class Gajah extends Hewan{
    public static void TestClassMethod(){
        System.out.println("The Class Method in Gajah..");
    }
    
    @Override
    public void TestInstanceMethod(){
        System.out.println("The Instance Mehod in Gajah..");
    }
    

    
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.TestClassMethod();
        myHewan.TestInstanceMethod();
    }
}
