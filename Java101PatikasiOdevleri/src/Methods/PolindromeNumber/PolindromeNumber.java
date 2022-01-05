package Methods.PolindromeNumber;
import java.util.Scanner;

public class PolindromeNumber {

    static String answer(long number, long reverseNumber){
        String ans;
        if (reverseNumber == number){
            ans = number + " => Sayı polindrom sayıdır.";
        }else {
            ans = number + " => Sayı polindrom sayı değildir.";
        }
        return ans;
    }

    static String polindrome(long number){
        long reverseNumber = 0, counter, lastDigit;
        counter = number;
        while(counter != 0){
            lastDigit = counter % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            counter /= 10;
        }
        return answer(number,reverseNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextLong();

        System.out.println(polindrome(number));
    }
}
