package Donguler.MaxMinNumber;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 1, input, maxNumber = 0, minNumber = 0, number;

        while (true){
            System.out.print("Kaç tane sayı gireceksiniz : ");
            input = scan.nextInt();
            System.out.println("------------------------------------");

            if (input > 0){
                break;
            }else {
                System.out.print("Lütfen pozitif sıfırdan büyük bir sayı giriniz. ");
            }
        }

        while (counter <= input){
            System.out.print(counter + ". sayıyı giriniz : ");
            number = scan.nextInt();
            if (number < minNumber){
                minNumber = number;
            }else if (maxNumber < number){
                maxNumber = number;
            }
            counter++;
        }
        System.out.println("------------------------------------");
        System.out.println("Girgiğniz sayılardan en büyük olan : " + maxNumber);
        System.out.println("Girgiğniz sayılardan en küçük olan : " + minNumber);
    }
}
