package CodingDay;
import java.util.Scanner;
public class equalsIgnoreCase78 {
    public static void main (String...wahyuni){
        Scanner input= new Scanner(System.in);
        System.out.print("masukkan username :");
        String name =input.nextLine();
        
        if (name.equalsIgnoreCase("Wahyuni")){
            System.out.println("username benar");
            
        }else{
            System.out.println("username salah");
        }
    }
    
}
