package Donguler.NumberOfDigits;
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, numberOfDigit = 0, counter, total = 0;

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        while(number != 0){
            counter = number % 10;
            total += counter;

            number /= 10;
            numberOfDigit++;
        }

        System.out.println(numberOfDigit + " basamaklı sayı girdiniz." +
                "Girdiğiniz sayının basamak değerleri toplamı : " + total);
    }
}
