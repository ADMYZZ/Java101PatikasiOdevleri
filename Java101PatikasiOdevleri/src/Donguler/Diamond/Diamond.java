package Donguler.Diamond;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("İki basamaklı bir sayı giriniz : ");
            number = input.nextInt();
        }while(number < 10);

        System.out.println("------------------------------");

        for (int i = 1; i <= number/2; i++){
            for (int k = 1; k <= (number/2 - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number/2 - 1; 1 <= i; i--){
            for (int k = 1; k <= (number/2 - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
