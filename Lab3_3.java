import java.util.Scanner;
public class Lab3_3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Bir sayı giriniz : ");

    int n = input.nextInt();

    for(int d= 1 ; d <= n ; d++){
        System.out.println();
        for(int i = 1 ; i <= d ; i++){
            System.out.print(i);
                      
            
        }
    
    }

    }

}
