/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ArrayProcessing {
    int[] dataBil = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            
            System.out.println("Masukkan bil ke-"+ (i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
        
    }
    
    double hitungRerata (int[] data){
        double jumlah = 0;
        for (int i=0; i<this.n; i++){
            jumlah += data[i];    
    }
        double rerata = jumlah/this.n;
        return rerata;
        
     
    }
    void output(){
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
    }
    
   int cariMax(int[] data){
       int Max;
        Max = data [0];
       for (int i =1; i < data.length; i++){
           if (data[i] >Max){
               Max = data[i];
           }
       }
        return Max;
        
        
   }
   
   int cariMin(int[] data){
       int Min;
       Min = data [0];
       for (int i =1; i > data.length; i++){
           if (data[i] < Min){
               Min = data[i];
           }
       }
        return Min;   
   }
   
   void Max (){
        System.out.println("Nilai Maksimal: " + this.cariMax(this.dataBil));
    }
   
   void Min (){
        System.out.println("Nilai Minimal: " + this.cariMin(this.dataBil));
    }
}
