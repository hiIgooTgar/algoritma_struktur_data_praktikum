package igo_praktikum_9;

public class praktikum_9_no_1 {

    public static void main(String[] args) {
        /* mendeklarasikan array dengan tipe data integer dan
         nama variabel array nya adalah nilai dengan panjang array 5 */
        int nilai[];
        nilai = new int[5];
        
        nilai[0] = 15; // mendeklarasikan array nilai yaitu index ke 0
        nilai[1] = 20; // mendeklarasikan array nilai yaitu index ke 1
        nilai[2] = 55; // mendeklarasikan array nilai yaitu index ke 2
        nilai[3] = 78; // mendeklarasikan array nilai yaitu index ke 3
        nilai[4] = 46; // mendeklarasikan array nilai yaitu index ke 4
        
        System.out.println(nilai[0]); // cetak perintah array nilai yaitu index ke 0
        System.out.println(nilai[1]); // cetak perintah array nilai yaitu index ke 1
        System.out.println(nilai[2]); // cetak perintah array nilai yaitu index ke 2
        System.out.println(nilai[3]); // cetak perintah array nilai yaitu index ke 3
        System.out.println(nilai[4]); // cetak perintah array nilai yaitu index ke 4
    }
    
}