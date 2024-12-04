package CodingDay94;
import java.util.Scanner;
public class polaSegitiga {
    public static void main(String [] args){
        Scanner haha = new Scanner(System.in);
        System.out.print("input angka:");
        int loh =haha.nextInt();
        

        for (int i = 1; i <= loh; i++) {
            
            for (int j = loh; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }


        
    }

