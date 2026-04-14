import java.util.Scanner;
class Urun{
    String ad;
    double fiyat;
    int adet;
    double toplam(){
        return fiyat*adet;
    }
    
    void urunBilgisiniYaz(){
        System.out.println("Ürün adı : " + ad);
        System.out.println("Fiyat : " + fiyat +"TL");
        System.out.println("Adet : " + adet);
        System.out.println("Satır tutarı " + toplam() +"TL");
        return;

    }
}
public class Urun2 {
    
    public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);

    //1.ürün bilgileri
    Urun urun1 = new Urun();
    System.out.println("1.ürün bilgilerini giriniz:");
    System.out.print("Ürün adı : ");
    urun1.ad = keyboard.nextLine();
    System.out.print("Fiyat : ");
    urun1.fiyat = keyboard.nextDouble();
    System.out.print("Adet : ");
    urun1.adet = keyboard.nextInt();
    keyboard.nextLine();
    //2.Ürün Bilgileri
    Urun urun2 = new Urun();
    System.out.println("2.ürün bilgilerini giriniz:");
    System.out.print("Ürün adı : ");
    urun2.ad = keyboard.nextLine();
    System.out.print("Fiyat : ");
    urun2.fiyat = keyboard.nextDouble();
    System.out.print("Adet : ");
    urun2.adet = keyboard.nextInt();

    keyboard.nextLine();

    //3.Ürün bilgileri
    Urun urun3 = new Urun();
    System.out.println("3.ürün bilgilerini giriniz:");
    System.out.print("Ürün adı : ");
    urun3.ad = keyboard.nextLine();
    System.out.print("Fiyat : ");
    urun3.fiyat = keyboard.nextDouble();
    System.out.print("Adet : ");
    urun3.adet = keyboard.nextInt();

    //Sipariş Özeti
    System.out.println("---SİPARİŞ ÖZETİ---");
    urun1.urunBilgisiniYaz();
    System.out.println("------------------------");
    urun2.urunBilgisiniYaz();
    System.out.println("------------------------");
    urun3.urunBilgisiniYaz();
    System.out.println("------------------------");
    System.out.println("Genel toplam: " + (int)(urun1.toplam() + urun2.toplam() + urun3.toplam()));
    
    if((int)(urun1.toplam() + urun2.toplam() + urun3.toplam()) >= 1000){
        System.out.println("İndirim uygulanabilir.");
    }
    else{
        System.out.println("İndirim yok.");

    }

    }

}
