package Methods.PolindromeNumber;
import java.util.Scanner;

public class PolindromeNumber {

    static String answer(int number, int reverseNumber){
        String ans;
        if (reverseNumber == number){
            ans = number + " => Sayı polindrom sayıdır.";
        }else {
            ans = number + " => Sayı polindrom sayı değildir.";
        }
        return ans;
    }

    static String polindrome(int number){
        int reverseNumber = 0, counter, lastDigit;
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
        int number;

        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        System.out.println(polindrome(number));
    }
}
