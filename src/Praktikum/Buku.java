/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Fareladzin Wibi
 */
public class Buku extends Perpustakaan{
    private String nobuku;
    public Buku(String nobuku, String namabuku, int jumlah) {
        super(namabuku, jumlah);
        this.nobuku = nobuku;
    }
    
    public void info(){
        System.out.println("No. Buku : "+ this.nobuku);
        super.info();
    }
}
