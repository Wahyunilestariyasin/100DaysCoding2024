package CodingDay91;
import java.util.Scanner;
public class LoDanGueEnd91 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan lah nilai :");
        int nilai = sc.nextInt();
        while(true){
            if(nilai%2==1){
                System.out.println("You and I,End!");
                break;
            }
            System.out.println("genap");
            System.out.print("Masukkan lah nilai :");
            nilai = sc.nextInt();
            
            
        }
    }
    
}
