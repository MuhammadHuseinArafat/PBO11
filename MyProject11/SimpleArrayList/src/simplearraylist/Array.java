/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

/**
 *
 * @author hp
 */
import java.util.Scanner;
import static java.util.Collections.binarySearch;
import java.util.ArrayList;

public class Array {
    ArrayList<String> data = new ArrayList<>();
    
    void tambah(){
        Scanner plus = new Scanner(System.in);
        System.out.println("Masukkan Data mu : ");
        data.add(plus.nextLine());
        System.out.println("Daftar String dalam array kamu :  " +data);
    }
    
    void cari(){
        Scanner search = new Scanner(System.in);
        System.out.println("Masukkan String yang ingin kamu cari: ");
        String searching = search.nextLine();
        if(binarySearch(data,searching) > -1 ){
            System.out.println("String " + searching + " ada di index ke : " + binarySearch(data,searching) + "di dalam data.");
        } else {
            System.out.println("String " + searching + " tidak ada didalam data");   
        }         
    }
    
    void hapus(){
        Scanner del = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin di hapus: ");
        String delete = del.nextLine();
        if(binarySearch(data,delete) > -1 ){
            System.out.println("String" + delete + "ada di index ke : " + binarySearch(data,delete) + "di dalam data.");
        } else {
            System.out.println("String " + delete + " tidak ada didalam data");   
        }  
    }
    
    void tampil(){
        System.out.println("Daftar String dalam Array adalah : " + data);
        
    }
    static void print(String text){
        System.out.println(text);
    }
}
