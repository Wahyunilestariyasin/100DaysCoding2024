package Codingday;

public class methodrekursif73 {
    
    public static void hehe(int gitu){
        System.out.println("nilai: " + gitu);
        
      
        if (gitu <= 0) {
            return;
        }
        
        
        hehe(gitu - 1);
    }
    
    public static void main(String[] args) {
        int deh = 5;
        
        hehe(deh);
    }
}
