package uts_asd;


public class looping {

public static int a;
    
public static void loopingFor() {
    for(a = 0; a <= 10; a++) {
        System.out.println("Ini adalah perulangan FOR sebanyak " + a);
    }
}

public static void loopingWhile() {
   while(a <= 10) {
    System.out.println("Ini adalah perulangan WHILE sebanyak " + a);
    a++;
    }
}

public static void loopingDoWhile() {
   
    do {
    System.out.println("Ini adalah perulangan DO WHILE sebanyak " + a);
    a++; 
    } while(a <= 10);
}

    public static void main(String[] args) {
        
        // looping For
        loopingFor();
        // looping While
        loopingWhile();
        // looping Do While
        loopingDoWhile();
        
    }
    
}
