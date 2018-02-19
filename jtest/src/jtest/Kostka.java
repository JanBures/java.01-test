/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtest;

import java.util.Random;
/**
 *
 * @author honza
 */
public class Kostka {
    
    Random rand = new Random();
    private int pocetStran;
    
    
    public Kostka(int pocetStran){
        this.pocetStran = pocetStran;
    }
    
    public Kostka(){
        this.pocetStran = 6;
    }
    
    public int hod(){
        return rand.nextInt(this.pocetStran);
    }
}
