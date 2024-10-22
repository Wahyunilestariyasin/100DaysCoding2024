package Codingday;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       // kalkulator sederhana
        Scanner aw =new Scanner(System.in);
        System.out.print("Masukkan operator aritmatika yang diinginkan :");
        char operator=aw.next().charAt(0);
        
        System.out.print("nilai pertama :");
       double angka1=aw.nextDouble();
        System.out.print("nilai kedua :");
       double angka2=aw.nextDouble();
       
       switch(operator){
          case'+':
          angka1 += angka2;
          System.out.println("hasil :"+angka1);
          break;
          
          case'-':
          angka1 -= angka2;
          System.out.println("hasil :"+angka1);
          break;
          
          case'*':
          angka1 *= angka2;
          System.out.println("hasil :"+angka1);
          break;
          
          case'/':
          angka1 /= angka2;
          if(angka2!=0){
             System.out.println("hasil :"+angka1);
          }else if(angka2==0){
             System.out.println("hasil tidak terdefinisi");
          }
          break;
          
          case'%':
          angka1 %= angka2;
          System.out.println("hasil :"+angka1);
          break;
          
          default:
          System.out.println("operator tidak valid");
          
          
          
       }
       
        
        
        
    }
    
}
