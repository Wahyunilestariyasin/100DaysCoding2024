import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int awal = 1;
        System.out.print("Masukkan angka akhir: ");
        int akhir = scanner.nextInt();

        System.out.println("Bilangan prima antara " + awal + " dan " + akhir + ":");
        for (int num = awal; num <= akhir; num++) {
            if (isPrima(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrima(int n) {
        boolean isPrima = true;

        if (n <= 1) {
            isPrima = false; 
        } else {
            int i = 2;
            while (i * i <= n) {
                if (n % i == 0) {
                    isPrima = false;
                    break; 
                }
                i++;
            }
        }

        return isPrima; 
    }
}
