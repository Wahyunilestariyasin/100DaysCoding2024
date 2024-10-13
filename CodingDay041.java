package tuyul;
import java.util.Scanner;

public class latihanScanner2 {
    public static void main (String[]args){
        String nama;
        int umur;
        byte p;
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("nama bapakmu? ");
        nama = input.nextLine();
        
        System.out.print("umurnya ");
        umur = input.nextInt();
        
        System.out.print("punya berapa perahu? ");
        p = input.nextByte();
        
        System.out.println("nama bapak saya\t:"+ nama);
        System.out.println("umur bapak saya\t:"+ umur + " tahun");
        System.out.println("punya \t\t:"+ p + " perahu");
        
        
        
        
        
        
    }
    
    
}
