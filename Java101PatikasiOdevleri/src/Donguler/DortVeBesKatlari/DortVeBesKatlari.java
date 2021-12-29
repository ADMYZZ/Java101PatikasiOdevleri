package Donguler.DortVeBesKatlari;
import java.util.Scanner;

public class DortVeBesKatlari {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        inputNumber = scan.nextInt();

        System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5 kuvveti olan sayılar;");
        for (int i = 1; i <= inputNumber; i++){
            if ((i % 4 == 0) || (i % 5 == 0)){
                System.out.print(i + ",");
            }
        }
    }
}
