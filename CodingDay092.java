package polaV;

public class hari92 {
    public static void main(String[] args) {
        int haha = 5; 

        for (int i = 0; i < haha; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            System.out.print("*");
            
            
            if (i < haha - 1) {
                for (int k = 0; k < 2 * (haha - i - 1) - 1; k++) {
                    System.out.print(" ");
                }
                
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
}
