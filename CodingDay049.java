package CodingDay;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner ror = new Scanner(System.in);
        System.out.print("input angka :");
        int a = ror.nextInt();
        
        if (a<0){
            System.out.println("angka mines");
        }else if (a>0){
            System.out.println("angka positif");
        }
    }
    
}
