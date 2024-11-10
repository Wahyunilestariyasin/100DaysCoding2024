package CodingDay;
import java.util.Scanner;

public class methodParameter70 {
    public static String hehe (String nama,int umur,double berat){
        return nama+" sekarang berusia "+umur+" tahun "+" berat badan "+berat+" kg";
    }
    public static void main(String[]args){
        Scanner aw = new Scanner(System.in);
        System.out.print("nama :");
        String name = aw.nextLine();
        System.out.print("umur :");
        int age =aw.nextInt();
        System.out.print("berat :");
        double bb =aw.nextDouble();
        
        System.out.println(hehe(name,age,bb));
    }
    
    }
