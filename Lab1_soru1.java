import java.util.Scanner ;
public class Lab1_soru1 {
    public static void main(String[] args) {

        /*Kullanıcıdan bir ürünün birim fiyatını (double) ve ürün adedini (int) alan,
         toplam tutarı hesaplayan ve ekrana aşağıdaki formatta yazdıran bir Java programı yazınız.*/
        Scanner giris = new Scanner(System.in);
        
        System.out.print("Lütfen ürün birim fiyatını belirleyiniz :");
        
        double a = giris.nextDouble();
        
        System.out.print("Lütfen istediğiniz adet sayısını giriniz :");
        
        int b = giris.nextInt();
       
        System.out.println("Ürünün birim fiyatı :" + a);
        
        System.out.println("Ürünün adet sayısı :" + b);
       
        double toplam = a*b ;
        
        
     
     
        System.out.println("Toplam tutar :" + toplam);


       


        
    }

}
