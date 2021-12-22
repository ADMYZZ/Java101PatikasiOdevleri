package KosulluIfadelerVeKodBloklari.SayiSiralama;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        int number1,number2,number3;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı : ");
        number1 = input.nextInt();
        System.out.print("2. sayı : ");
        number2 = input.nextInt();
        System.out.print("3. sayı : ");
        number3 = input.nextInt();

        if (number1 < number2 && number1 < number3){
            if (number2 < number3){
                System.out.print("1.sayı < 2.sayı < 3.sayı");
            }else if (number2 == number3){
                System.out.print("1.sayı < 2.sayı = 3.sayı");
            }else {
                System.out.print("1.sayı < 3.sayı < 2.sayı");
            }
        }
        else if (number2 < number1 && number2 < number3){
            if (number1 < number3){
                System.out.print("2.sayı < 1.sayı < 3.sayı");
            }else if (number1 == number3){
                System.out.print("2.sayı < 1.sayı = 3.sayı");
            }else {
                System.out.print("2.sayı < 3.sayı < 2.sayı");
            }
        }
        else if (number3 < number1 && number3 < number2){
            if (number1 < number2){
                System.out.print("3.sayı < 1.sayı < 2.sayı");
            }else if (number1 == number2){
                System.out.print("3.sayı < 1.sayı = 2.sayı");
            }else {
                System.out.print("3.sayı < 2.sayı < 1.sayı");
            }
        }
        else if(number1 == number2 && number1 < number3){
            System.out.print("1.sayı = 2.sayı < 3.sayı");
        }
        else if(number1 == number3 && number1 < number2){
            System.out.print("1.sayı = 3.sayı < 2.sayı");
        }
        else if(number2 == number3 && number2 < number1){
            System.out.print("2.sayı = 3.sayı < 1.sayı");
        }else {
            System.out.print("1.sayı = 2.sayı = 3.sayı");
        }
    }
}
