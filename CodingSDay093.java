package polaV;

public class polaVterbalik {
    public static void main(String[] args) {
        int haha = 10; 

        
        for (int i = 0; i < haha; i++) {
            
            
            for (int j = 0; j < haha - i - 1; j++) {
                System.out.print(" ");
            }
            
            System.out.print("*");
            
            if (i > 0) {
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
