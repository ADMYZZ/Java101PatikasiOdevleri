package Methods.FibonacchiNumbers;
import java.util.Scanner;

public class FibonacchiNumbers {

    static int fibonacchi(int level) {
        if (level == 1 || level == 2) {
            return 1;
        }
        return fibonacchi(level - 1) + fibonacchi(level - 2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level;

        do {
            System.out.print("Fibonacci serisinin kaçıncı elemanını istiyorsunuz" +
                    "(Çıkmak için 0 tuşlayınız.) : ");
            level = sc.nextInt();

            if (level == 0) {
                break;
            } else if (level > 0) {
                System.out.println("Serinin " + level + ". elemanı => " + fibonacchi(level));
                System.out.println("------------------------------------------------------");
            } else {
                System.out.println("------------------------------------------------------");
                System.out.println("Lütfen pozitif bir sayı giriniz.");
            }
        } while (true);
    }
}
