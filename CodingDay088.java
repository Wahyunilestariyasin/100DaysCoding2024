package CodingDay88;
import java.util.Scanner;
public class SoalHari88 {
    public static void main(String[]args){
        int array[] = {50,22,31,2,8,100,78,19,98,92};
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai bulat rentang 1-100:");
        int a = input.nextInt();
        boolean hi=false;
        for(int i = 0;i<=9;i++){
            if (a==array[i]){
                System.out.println("Nilai ditemukan!");
                hi=true;
                break;
            }
        }
        if(!hi){
            System.out.println("Nilai tidak ditemukan");
        }
    }
    
} 
