package CodingDay;

public class CodingDay33 {
    public static void main(String []args){
     //castig otomatis(mengonversi dari tipe data kecil ke tipe data yang lebih besar)
    int nilai1 =12;
    double nilai2=nilai1;
    System.out.println("casting otomatis :"+nilai2);
        
     //casting manual(mengonversi dari tipe data besar ke tipe data yang lebih kecil)
        double nilai3 = 51.1;
        int nilai4 =(int)nilai3;   
        System.out.println("casting manual :"+nilai4);
}
}
