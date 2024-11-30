package CodingDay90;
import java.util.Scanner;
public class soal90 {
    public static void main(String[]args){
        Scanner aw= new Scanner(System.in);
        int tampung=1;
        System.out.print("Masukkan nilai :");
        int n=aw.nextInt();
        
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.print(i);
            }else{
            System.out.print("x"+i);
            }
            tampung*=i;
        }
        System.out.println(" = "+tampung);
        
        

    }
    
}
