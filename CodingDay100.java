package CodingDay100yeay;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;
public class menunjukkanJam {
    public static void main(String[]args){
        Scanner aw = new Scanner(System.in);
        System.out.print("input nama pengguna :");
        String nama =aw.nextLine();
        LocalTime waktu =LocalTime.now(ZoneId.of("Asia/Makassar"));
        
        LocalTime pagi = LocalTime.of(00,00);
        LocalTime siang = LocalTime.of(12,0);
        LocalTime malam = LocalTime.of(17,01);
        
        if(waktu.isAfter(pagi) && waktu.isBefore(siang)){
            System.out.println("\n==================================================\n");
            System.out.println("Selamat Pagi,"+nama+"semoga harimu menyenangkan!");
            System.out.println("Program anda telah selesai");
           System.out.println("\n==================================================");
        }else if(waktu.isAfter(siang) && waktu.isBefore(malam)){
            System.out.println("==================================================\n");
            System.out.println("Selamat Siang,"+nama+"Mau makan apa siang ini");
            System.out.println("Program anda telah selesai");
            System.out.println("\n==================================================");
        }else{
            System.out.println("==================================================\n");
            System.out.println("Selamat malam "+nama+",Bagaimana harimu?");
            System.out.println("Program anda telah selesai");
            System.out.println("\n==================================================");
        }
        
        
            
    }
    
}
