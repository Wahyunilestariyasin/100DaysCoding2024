import java.util.Scanner;

public class segitigaSikuSiku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int haha= scanner.nextInt();
        
        System.out.println("\nSegitiga Siku-Siku Biasa:");
        for (int i = 1; i <= haha; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        System.out.println("\nSegitiga Siku-Siku Terbalik:");
        for (int i = haha; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}


