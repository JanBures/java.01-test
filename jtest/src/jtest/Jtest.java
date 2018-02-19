/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtest;

/**
 *
 * @author honza
 */
public class Jtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Matice matice = new Matice(5,18,10);
        System.out.println(matice.generuj());   
        matice.getData();
    }
    
}
