package CodingDay98;
import java.util.Scanner;
public class jumlahAngkaGenapXkeY {
    public static void main(String[]args){
        Scanner aw = new Scanner(System.in);
        System.out.print("masukkan nilai batas awal:");
        int x = aw.nextInt();
        System.out.print("masukkan nilai batas akhir :");
        int y = aw.nextInt();
        int wadah=0;
        
        if(x<y){
            for(int i =x; i<=y;i++){
            if(i%2==0){
                wadah+=i;
            }else{
                continue;
            }
            }
        }
        
        if(y<x){
            for(int i = x;i>=y;i--){
                if (i%2==0){
                    wadah+=i;
                }else{
                    continue;
                }
            }
        }
        
         System.out.println("total bilangan genap dari x ke y :"+wadah);
    }
    
}
