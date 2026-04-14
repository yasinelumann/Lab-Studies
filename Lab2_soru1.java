import java.util.Scanner;
public class Lab2_soru1 {
    public static void main(String[] args) {

    //Javanın klavyeden veri alabilmesi için bir giriş kapısı açıyorum
    Scanner keyboard = new Scanner(System.in);
    //Kullanıcının ekranında çıktı oluşturuyorum
    System.out.println("Harf notu hesaplayıcıya hoşgeldiniz");
    System.out.print("Lütfen 0-100 arasında sınav not giriniz : "); 
    //Kullanıcının klavyeden veri girmesi için metot belirliyorum ve kullanıcının ekranına yolluyorum
    double not = keyboard.nextDouble();
    //Kullanıcının girdiği sayıyı gösteriyorum
    System.out.println("Girilen not :" + not);
    //Kullanıcının girdiği sayı belirlenen aralıktaysa alttaki koşullara göre notunu belirliyoruz ve ekrana çıktı veriyoruz.
    if(not >= 0 && not <= 100){
        if(not <= 100 && not >= 90){
            System.out.println("Harf notunuz : AA ");
        }
        else if(not < 90 && not >= 85){
            System.out.println("Harf notunuz : BA");
        }
        else if(not < 85 && not >= 80) {
            System.out.println("Harf notunuz : BB");
        }
        else if(not < 80 && not >= 70){
            System.out.println("Harf notunuz :CB");
        }
        else if(not < 70 && not >= 60){
            System.out.println("Harf notunuz :CC");
        }
        else if(not < 60 && not >= 50){
            System.out.println("Harf notunuz :DC");
        }
        else if(not < 50 && not >= 40) {
            System.out.println("Harf notunuz :DD");
        }
        else if(not < 40 && not >= 30){
            System.out.println("Harf notunuz :FD");
        }
        else if(not < 30 && not > 0){
            System.out.println("Harf notunuz :FF");
        }
        else if(not == 0){
            System.out.println("Harf notunuz : D");

        }
    }
    //Eğer kullanıcının girdiği sayı koşulları sağlamazsa hata mesajı veriyoruz.
    else{
        System.out.println("Hatalı işlem.Lütfen 0-100 aralığında not giriniz.");

    }
    keyboard.close();



    }
}
