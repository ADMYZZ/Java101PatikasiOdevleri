package Donguler.HarmonicSeries;
import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;
        int number;

        do {
            System.out.print("Pozitif bir sayı giriniz : ");
            number = scan.nextInt();
        }while(number < 0);

        for (int i = 1; i <= number; i++){
            result +=(1.0 / i);
        }
        System.out.print("Gİrdiğiniz sayının harmonik seri toplamı sonucu : " + result);
    }
}
