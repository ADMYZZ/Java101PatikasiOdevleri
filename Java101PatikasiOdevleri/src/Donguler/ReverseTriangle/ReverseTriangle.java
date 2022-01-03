package Donguler.ReverseTriangle;
import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level;

        do {
            System.out.print("Kaç basamaklı ters üçgen istersiniz : ");
            level = input.nextInt();
        } while (level <= 0);

        for (int i = level; 1 <= i; i--){
            for (int k = 1 ; k <= level-i; k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
