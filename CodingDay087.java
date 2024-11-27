package CodingDay87;

public class mengubahNilaiIndexTertentu {
    
    public static void main(String[]args){
        double [] tinggi={12.5,56.0,70.43,49.79};
        
        tinggi[3]=24.7;
        tinggi[0]=85.0;
        
        for(int i =0; i<=3;i++){
            if(i==0 || i==3){
                System.out.println("Nilai array yang berubah:"+tinggi[i]);
            }else{
                System.out.println("Nilai array :"+tinggi[i]);
            }
        }
    }
}
