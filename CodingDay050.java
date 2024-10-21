package CodingDay;

public class Main {
    
    public static void main(String[] args) {
        String a = "Spesifikasi bidadari";
        
        if (a.equals("spesifikasi bidadari")){
            System.out.println("cepat mati");
        }else if(a.equalsIgnoreCase("Spesifikasi BIDADARI")){
            System.out.println("optimislah dalam hidup");
        }else{
            System.out.println("kau buruk");
        }
        
        
        /*outputnya adalah pesan,mengapa hanya kondisi kedua yang menggunakan
        IgnoreCase? 
        sejak awal hanya kata kata positiflah yang tercetak ingin kucetak
        dan IgnoreCase adalah caraku untuk melakukan itu
        ada banyak cara untuk menghindari kata negatif.
        tapi letaknyapun memegang peran sangat penting*/
        
        
        
        }
}
