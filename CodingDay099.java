package CodingDay099.java;
import java.util.Scanner;

public class kalkulatorr {
    public static void main(String[]args){
        Scanner aw = new Scanner(System.in);
        System.out.println("Kalkulator sederhana");
        double a,b;
        char c;
        System.out.print("Masukkan nilai pertama :");
        a = aw.nextDouble();
        System.out.print("Masukkan operator aritmatika :");
        c = aw.next().charAt(0);
        System.out.print("Masukkan nilai kedua :");
        b = aw.nextDouble();
        
           
        if(c=='+'){
            a+=b;
            System.out.println("hasil nilai a + b ="+a);
        }else if(c=='-'){
            a-=b;
        System.out.println("hasil a-b ="+a);
        }else if(c=='*'){
            a*=b;
        System.out.println("hasil a*b ="+a);
        }else if(c=='/'){
            a/=b;
        System.out.println("hasil a/b ="+a);
        }else if(c=='%'){
            a%=b;
        System.out.println("hasil a%b ="+a);
       }else{
           System.out.println("operator tidak valid");
       }
}
    }
