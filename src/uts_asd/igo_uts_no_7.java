package uts_asd;

public class igo_uts_no_7 {

    public static void main(String[] args) {
        int a = 239, b = 195;
        // 11101111(2) = 239(10)
        // 11000011(2) = 195(10)
        // 00101100
        
        int xor = a ^ b;
        System.out.println("Maka hasil " + a + " XOR/^ " + b + " adalah " + xor);
        // 10110000(2) = 44(10)
    }
    
}
