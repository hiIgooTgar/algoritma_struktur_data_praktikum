package uts_asd;
import java.util.Scanner;

public class Igo_circle_phi {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        // Mendeklarasi suatu variabel
        int jari_jari;
        double luasLingkaran;
       
        System.out.println("Mencari Luas Lingkaran");
        // Menginput jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran = ");
        jari_jari = input.nextInt();
        
        /* Maksud dari Math.PI itu bawaan dari Java, dengan memiliki value 
        3,141592653589793 tapi yang itu 22/7 termasuk enda yah hehe, tapi yang
        penting itu bernilai 3.14....... sekian sekian*/
        // Rumus Luas Lingkaran Yaitu PI * r * r;
        luasLingkaran = Math.PI * jari_jari * jari_jari;
        
        //cetak variabel luasLingkaran
        System.out.println("Luas Lingkaran : " + luasLingkaran);
       
    }
    
}
