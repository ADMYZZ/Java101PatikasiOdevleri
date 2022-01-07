package Methods.PrimeNumberRecursive;
import java.util.Scanner;

public class PrimeNumberRec {

    static boolean isPrime(int number){
        boolean session = true;
        if (number < 2){
            session = false;
        }else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    session = false;
                    break;
                }
            }
        }
        return session;
    }

    /*static boolean isPrime(int number,int i){
        if(i == number/2){
            return true;
        }else if(number%i == 0){
            return false;
        } else {
            return isPrime(number,i+1);
        }
    }
    Githubda bulduğum çözüm eksi sayılar için anlayamadım!!!!
    Recursive metod ile yapamadım.
    */

    static void primeAnswer(){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Sayıyı giriniz : ");
        number = sc.nextInt();

        if (isPrime(number)){
            System.out.println(number + " sayısı asaldır.");
        }else {
            System.out.println(number + " sayısı asal değildir.");
        }
    }


    public static void main(String[] args) {
        primeAnswer();
    }
}
