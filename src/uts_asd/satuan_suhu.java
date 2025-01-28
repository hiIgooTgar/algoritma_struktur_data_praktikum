package uts_asd;
// import Scanner
import java.util.Scanner;

public class satuan_suhu {

    public static void main(String[] args) {
        //Mendeklarasi scanner menjadi input
        Scanner input = new Scanner(System.in);
        
        // Mendeklarasi suatu variabel
        double celcius, fahreinhet, reamur, kelvin;
        
        // input nilai Celcius menggunakan Scanner
        System.out.print("Masukkan Suhu Dalam Celcius : ");
        celcius = input.nextDouble();
        
        // rumus Celcius Konversi ke Fahreinhet
        fahreinhet= celcius*9/5+32;
        // rumus Celcius Konversi ke Reamur
        reamur = celcius*4/5;
        // rumus Celcius Konversi ke Kelvin
        kelvin = celcius + 275.15;
        
        System.out.println("");
        System.out.println("1. Fahreinhet");
        // cetak variabel celcius dan variabel fahreinhet
        System.out.println(celcius + " Celcius" +  " = " + fahreinhet + " Fahreinhet");
        System.out.println("2. Kelvin");
        // cetak variabel celcius dan variabel Kelvin
        System.out.println(celcius + " Celcius " +  " = " + kelvin + " Kelvin");
        System.out.println("3. Reamur");
        // cetak variabel celcius dan variabel Reamur
        System.out.println(celcius + " Celcius " +  " = " + reamur + " Reamur");

    }
    
}
