package CodingDay;

public class Main {
    
    public static void main(String[] args) {
        int nilai1=8;
        int nilai2=7;
        
        boolean logikaAND=(nilai1==8 && nilai2==7);
        System.out.println("keduanya benar maka hasil : "+logikaAND);
        
        boolean logika2 =(nilai1==7 && nilai2==7);
        System.out.println("ada satu yang salah maka hasil:"+logika2);
    
            //syarat logika and:
            //-keduanya harus bernilai true untuk menghasilkan true
            //-jika salah satu salah maka hasilnya false
            //-jika keduanya false maka false
    }
    
}
