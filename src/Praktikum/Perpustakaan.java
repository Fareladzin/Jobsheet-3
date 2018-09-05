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
public class Perpustakaan {
    private String namabuku;
    private int jumlah;
    
    public Perpustakaan (String namabuku, int jumlah){
        this.namabuku = namabuku;
        this.jumlah = jumlah;
    }
    
    public void info(){
        System.out.println("Nama Buku : "+this.namabuku);
        System.out.println("Jumlah Buku : "+this.jumlah);
    }
}
