package uts_asd;
import java.util.Scanner;

public class igo_circle {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
           //TUGAS PRAK 3 NOMOR 3 DAN 4
          
           //PROGRAM LUAS LINGKARA
          int jari_jari;
          double LuasLingkaran;
                  
          System.out.println("mencari Luas Lingkaran");
          System.out.println("masukan JARI_JARI lingkaran =");
          jari_jari = input.nextInt();
          
          LuasLingkaran = Math.PI * jari_jari * jari_jari;
          
          System.out.println("LuasLingkaran : " + LuasLingkaran);
          System.out.println("");
    }
}