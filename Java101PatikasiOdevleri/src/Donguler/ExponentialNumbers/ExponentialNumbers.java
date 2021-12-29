package Donguler.ExponentialNumbers;
import  java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        /* Exp.: 2^3 means 2*2*2 and result = 8
         number1 = 2 ; number2 = 3
         */
        int number1, number2, result = 1;
        String ans;
        Scanner scan =new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        number1 = scan.nextInt();
        System.out.print(number1 + " üssü kaç : ");
        number2 = scan.nextInt();

        if (number2 >= 0) {
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
            ans ="" + result;
        }else {
            for (int i = -1; number2 <= i; i--) {
                result *= number1;
            }
            ans = "1 / " + result;
        }
        System.out.println(number1 + " üzeri " + number2 + " = " + ans);
    }
}
