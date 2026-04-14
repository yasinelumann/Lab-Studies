import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        System.out.println("Lütfen Pozitif Bir Sayı Giriniz : ");

        Scanner keyboard = new Scanner(System.in);
        int sayi = keyboard.nextInt();

        int toplam = 0;
        int kalan = 0;
        int basamak_sayisi = 0;
        

        while (true) {
            if(sayi <= 0){
            System.out.println("Lütfen pozitif bir sayı giriniz!");
            break;
        }
            kalan = sayi % 10;
            

            if(sayi == 0){
                break;
            }

            else if(kalan == 0){
                continue;
            }
            else {
                basamak_sayisi++;
                toplam = toplam + kalan;
                sayi = sayi / 10;
            }
            }
        System.err.println("Basamak Sayısı : " + basamak_sayisi);
        System.out.println("Rakamlar Toplamı : " + toplam);

    }

}
