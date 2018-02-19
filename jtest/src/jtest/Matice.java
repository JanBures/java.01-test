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
public class Matice {
    
    private int[][] data;
    private int radku, sloupcu;
    Kostka kostka;
    static int maxNum = 6;
    
    /****
     * Konstruktor
     * @param radku
     * @param sloupcu 
     */
    public Matice(int radku, int sloupcu){       
        this(radku,sloupcu,maxNum);
    }
    
    public Matice(){
        this(6,6);
    }
    
    public Matice(int radku, int sloupcu, int maxNum){
        this.radku = radku;
        this.sloupcu = sloupcu;
        this.data = new int[this.radku][this.sloupcu];    
        this.maxNum = maxNum;
        kostka = new Kostka(this.maxNum);
    }
    
    public int[][] generuj(){        
        for(int radek=0;radek<this.data.length;radek++){
            for(int sloupec = 0; sloupec<this.data[radek].length;sloupec++){
                this.data[radek][sloupec] = (int) kostka.hod();
            }
        }
        return this.data;
   }
    
    public void getData(){
        for(int x=0; x<this.data.length;x++){
            for(int y=0;y<this.data[x].length;y++){
                System.out.print(this.data[x][y]+"\t ");
                
            }
            System.out.println();
        }
    }
        
}