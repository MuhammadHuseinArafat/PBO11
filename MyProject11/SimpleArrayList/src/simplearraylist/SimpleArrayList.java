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
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String ulang = "y";
        while (ulang.equals("y")){
            System.out.println("");
            Scanner input = new Scanner(System.in);
            String ul="",lagi;
            System.out.println("---- SELAMAT DATANG-----");
            System.out.println("");
            System.out.println(" Menu Data ArrayList ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("==============================");
            System.out.println("Pilih Menu dulu ya [1/2/3/4/5] =  "); int pilih = input.nextInt();
            System.out.println("==============================");
            switch (pilih){
                case 1:{
                    Array a = new Array();
                    a.tambah();
                    break;
                }
                
                case 2:{
                    Array a = new Array();
                    a.cari();
                    break;
                }
                case 3:{
                    Array a = new Array();
                    a.hapus();
                    break;
                }
                 case 4:{
                    Array a = new Array();
                    a.tampil();
                    break;
                }
                case 5:{
                    System.exit(0);
                    System.out.println("Terima Kasih Kaka");
                    
                }
                
                break;   
        }
            System.out.println("==========================================");
            System.out.println("Apakah kamu ingin mengulangi lagi(y/n) ?");
            ulang = input.next();
        }
    }
    
}
