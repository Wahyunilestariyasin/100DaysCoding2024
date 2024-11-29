package CodingDay88;
import java.util.Scanner;

public class soalday89 {
    public static void main(String[] args) {
        int array[] = {50, 22, 31, 2, 8, 100, 78, 19, 98, 92};
        Scanner input = new Scanner(System.in);
        String a;
        
        while (true) {
            System.out.println("Masukkan nilai bulat (atau ketik 'Stop' untuk berhenti):");
            a = input.next();
            
            if (a.equalsIgnoreCase("Stop")) {
                System.out.println("Program berhenti.");
                break;
            }
            
            int angka;
            try {
                angka = Integer.parseInt(a);
                boolean found = false;
                for (int i = 0; i < array.length; i++) {
                    if (angka == array[i]) {
                        System.out.println("Nilai ditemukan!");
                        found = true;
                        break;
                        }
                }
                if (!found) {
                    System.out.println("Nilai tidak ditemukan.");
                    }
                
            } catch (NumberFormatException e) {
                System.out.println("buta lo? angka bulat/stop jir");
            }
        }
    }
}
