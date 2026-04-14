import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("-Hesap Makinesine Hoşgeldiniz-");
        String devam;

        do
        {
        System.out.println("----------------------------");
        System.out.print("Lütfen x sayısını giriniz : ");
        double x = keyboard.nextDouble();
        System.out.println("----------------------------");
        System.out.print("Lütfen y sayısını giriniz : ");
        double y = keyboard.nextDouble();
        System.out.println("----------------------------");

        double toplam = x + y ;
        double mutlakcıkarma = Math.abs(x-y);
        double cıkarma = x - y;
        double carpma = x * y;
        double bolme = x / y ;
        double bolme2 = y /x;
        System.out.println("----------------------------");
        System.out.println("Toplama için - 1");
        System.out.println("----------------------------");
        System.out.println("Mutlak Değerce Çıkarmak için - 2");
        System.out.println("----------------------------");
        System.out.println("x Sayısını y Sayısından Çıkarmak için - 3");
        System.out.println("----------------------------");
        System.out.println("Çarpmak için - 4");
        System.out.println("----------------------------");
        System.out.println("x Sayısını y Sayısına Bölmek için - 5");
        System.out.println("----------------------------");
        System.out.println("y Sayısını x Sayısına Bölmek için - 6");
        System.out.println("----------------------------");

        int secim = keyboard.nextInt();
        keyboard.nextLine();

        switch (secim) {
            case 1:
                System.out.println("Toplama : " + toplam);
                break;
            case 2:
                System.out.println("Mutlak Değerce Çıkarma : " + mutlakcıkarma );
                break;
            case 3:
                System.out.println("x Sayısını y Sayısından Çıkarma : " + cıkarma);
                break;
                
            case 4:
                System.out.println("Çarpma : " + carpma);
                break;
            case 5:
                if(y == 0){
                    break;
                }
                else{
                System.out.println("x Sayısının y Sayısına Bölümü : " + bolme);
                break;
                }
            case 6:
                if(x == 0){
                    break;
                }
                else{
                System.out.println("y Sayısının x Sayısına Bölümü : " + bolme2);
                break;
                }
            default:
                System.out.println("Geçersiz Seçim Yaptınız!!");

            
            }
            System.out.println("---------------------------------------------------");
            System.out.println("Sistemi Tekrar Kullanmak İçin 'E' Tuşuna Basınız :)");
            System.out.println("---------------------------------------------------");
            System.out.println("Sistemden Çıkmak İstiyorsanız 'H' Tuşuna Basınız.");
            System.out.println("---------------------------------------------------");

            devam = keyboard.nextLine();
        
        
        }while(devam.equalsIgnoreCase("E"));
        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println(" İyi Günler Dileriz. "); 
        System.out.println("---------------------");    
        
        keyboard.close();
    }
}


