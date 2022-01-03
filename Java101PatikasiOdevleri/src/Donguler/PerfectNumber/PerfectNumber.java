package Donguler.PerfectNumber;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        if (number <= 0){
            System.out.println(number + " sayısı mükemmel sayı değildir.");

        }else {
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                    total += i;
                }
            }
            if (total == number){
                System.out.println(number + " sayısı mükemmel sayıdır.");
            }else {
                System.out.println(number + " sayısı mükemmel sayı değildir.");
            }
        }
    }
}
