package Donguler.Fibonacci;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level, number1 = 1, number2 = 0, total = 0;

        do{
            System.out.print("Fibonacci serisi kaç elemanlı olsun(En az 2 olabilir) : ");
            level = scan.nextInt();
        }while(level < 2);

        for (int i = 0; i <= level; i++){
            System.out.print(total + " ");
            total = number1 + number2;
            number1 = number2;
            number2 = total;

        }
    }
}
