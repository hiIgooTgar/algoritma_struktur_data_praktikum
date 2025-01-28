package igo_praktikum_15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class fungsi_procedure {
    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException {
        System.out.println("============ Menu ============");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("Pilih Menu => ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        switch(selectedMenu) {
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default: 
                System.out.println("Pilihan tidak valid!");
        }
    }
    
    static void showAllBuah() {
        if(listBuah.isEmpty()) {
            System.out.println("Data buah kosong");
        } else {
            for(int i = 0; i < listBuah.size(); i++) {
                System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
            }
        }
    }
    
    static void insertBuah() throws IOException {
        System.out.print("Nama buah : ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }
    
    static void editBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomer buah : ");
        int indexBuah = Integer.valueOf(input.readLine());
        
        System.out.print("Nama buah baru : ");
        String namaBuahBaru = input.readLine();
        
        listBuah.set(indexBuah, namaBuahBaru);
    }
    
    static void deleteBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomer buah : ");
        int indexBuah = Integer.valueOf(input.readLine());    
        listBuah.remove(indexBuah);
    }
    
    public static void main(String[] args) throws IOException {
        do {
            showMenu();
            System.out.println("");
        } while(isRunning);
        
    }
}