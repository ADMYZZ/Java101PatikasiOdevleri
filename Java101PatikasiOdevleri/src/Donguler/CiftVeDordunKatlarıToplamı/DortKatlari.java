package Donguler.CiftVeDordunKatlarıToplamı;
import java.util.Scanner;

public class DortKatlari {
    public static void main(String[] args) {
        int input, total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz : ");
            input = scan.nextInt();
            if (input % 4 == 0){
                total += input;
            }
        }while(input % 2 == 0);

        System.out.print("Toplam : " + total);
    }
}
