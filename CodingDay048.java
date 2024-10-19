package CodingDay;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nilai :");
        int a = in.nextInt();
        
        
        if(a%2==1){
            System.out.println("nilai ganjil");
        }else{
            System.out.println("nilai genap");
        }
    
        
    }
    
}
