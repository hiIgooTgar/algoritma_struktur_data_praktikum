package uts_asd;
import java.util.Scanner;

public class igo_uts_no_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade = "";
         
        System.out.print("Masukkan nilai anda : ");
        int nilai = input.nextInt();
        
        if(nilai >= 90) {
            grade = "A";
        } else if(nilai >= 88) {
            grade = "B+";
        } else if(nilai >= 78) {
            grade = "B";
        } else if(nilai >= 68) {
            grade = "C+";
        }  else {
            grade = "E";
        }
        
        System.out.println("Nilai anda " + nilai + " dan Grade anda adalah " + grade);
    }
    
}
