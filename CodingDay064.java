package CodingDay;

public class Main {
    
    public static void main(String[] args) {
        stopLoop:
        for(int i =1; i<=20; i++){
            if (i>5){
                break stopLoop;
            }
            System.out.print(i+" ");
            
        }
    }
    
}
