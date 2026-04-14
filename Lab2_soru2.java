import java.util.Scanner;
public class Lab2_soru2 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String kayıtlı_kullanıcı = "Admin";
        String kayıtlı_sifre = "Sifre1234";

        System.out.println("----------------------------------");
        System.out.println("  Kullanıcı Paneline Hoşgeldiniz");
        System.out.println("----------------------------------");

        System.out.print("Kullanıcı adınızı giriniz :");
        String giriş_kullanıcı = keyboard.nextLine();
 
        System.out.print("Şifrenizi giriniz :");
        String giriş_şifre = keyboard.nextLine();

        if(giriş_kullanıcı.equalsIgnoreCase(kayıtlı_kullanıcı) && giriş_şifre.equals(kayıtlı_sifre)){
            System.out.print("Giriş başarılı , hoşgeldiniz " + giriş_kullanıcı);
        }
        else{
            System.out.print("Kullanıcı veya şifre hatası. Lütfen tekrar deneyiniz.");
        }
        keyboard.close();
    }  

}
