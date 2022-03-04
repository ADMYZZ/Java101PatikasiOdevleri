package SayıTahminOyunu;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // control() gönderdiğimiz değer tahmin etme hakkımız. control(3) için üç tahmin hakkı veriyor.
        control(5);
    }

    static int generateNumber(){
        return  (int) (Math.random() * 100);
    }

    static int guess(int counter){
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tahmininiz (0 - 100 arasında olmalı) : ");
        guess = sc.nextInt();
        if (counter == 1){
            sc.close();
        }
        return guess;
    }

    public static void control(int counter){
        int number = generateNumber();
        System.out.println(number);
        while(counter > 0) {
            int guess = guess(counter);
            if ((guess <= 0) || (guess >= 100)) {
                System.out.println("Lütfen 0 - 100 arasında bir sayı giriniz.");
            } else if (guess == number) {
                System.out.println("Tebrikler bildiniz.");
                break;
            } else {
                System.out.println("Yanlış tahmin. Kalan hak : " + --counter);
                if (guess < number) {
                    System.out.println("Tahmininiz aranan sayıdan küçük.");
                } else {
                    System.out.println("Tahmininiz aranan sayıdan büyük.");
                }
                System.out.println("----------------------------------------------");
            }
        }
        if (counter == 0){
            System.out.println("Aranan sayı : " + number);
        }
    }
}
