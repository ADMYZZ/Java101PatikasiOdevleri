package Methods.AdvencedCalculator;

import java.util.Scanner;

public class AdvencedCalculator {


        static void plus() {
            Scanner scan = new Scanner(System.in);
            int number, result = 0, counter = 2;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();
                result += number;
            }
            System.out.println("Sonuç : " + result);
        }

        static void minus() {
            Scanner scan = new Scanner(System.in);
            int number, result = 0, counter = 2;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();
                if (i == 1) {
                    result += number;
                }else {
                    result -= number;
                }
            }

            System.out.println("Sonuç : " + result);
        }

        static void times() {
            Scanner scan = new Scanner(System.in);
            int number, result = 1, counter = 2;


            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();

                if (number == 0) {
                    result = 0;
                    break;
                } else {
                    result *= number;
                }
            }

            System.out.println("Sonuç : " + result);
        }

        static void divided() {
            Scanner scan = new Scanner(System.in);
            double result = 1, counter = 2, number;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();

                if (i != 1 && number == 0){
                    System.out.println("Sayı sıfıra bölünemaz.");
                }else if( i == 1){
                    result = number;
                }else {
                    result /= number;
                }
            }

            System.out.println("Sonuç : " + result);
        }

        static void power() {
            Scanner scan = new Scanner(System.in);

            System.out.print("Taban değeri giriniz :");
            int base = scan.nextInt();
            System.out.print("Üs değeri giriniz :");
            int exponent = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println("Sonuç : " + result);
        }

        static void factorial() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayı giriniz :");
            int n = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            System.out.println("Sonuç : " + result);
        }

        static void mod(){
            Scanner scan = new Scanner(System.in);
            double result = 1, counter = 2, number;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();
                if (i == 1){
                    result = number;
                }else {
                    result %= number;
                }
            }

            System.out.println("Sonuç : " + result);
        }

        static void rectangleArea(){
            Scanner scan = new Scanner(System.in);
            int result = 1, counter = 2, number;
            boolean check = false;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". kenar :");
                number = scan.nextInt();
                if (number >= 1) {
                    result *= number;
                    check = true;
                }else {
                    check = false;
                }
            }
            if (check){
                System.out.println("Dörtgenin alanı : " + result);
            }else {
                System.out.println("Kenar uzunluğu eksi olamaz.");
            }

        }

        static void rectangleCircumference(){
            Scanner scan = new Scanner(System.in);
            int result = 0, counter = 2, number;
            boolean check = false;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". kenar :");
                number = scan.nextInt();
                if (number >= 1) {
                    result += number;
                    check = true;
                }else {
                    check = false;
                }
            }
            if (check){
                System.out.println("Dörtgenin alanı : " + result);
            }else {
                System.out.println("Kenar uzunluğu eksi olamaz.");
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int select;
            String menu = """
                    ----------------------------------------------
                    1- Toplama İşlemi
                    2- Çıkarma İşlemi
                    3- Çarpma İşlemi
                    4- Bölme işlemi
                    5- Üslü Sayı Hesaplama
                    6- Faktoriyel Hesaplama
                    7- Mod Alma
                    8- Dörtgenin Alanı
                    9- Dörtgenin Çevresi
                    0- Çıkış Yap""";

            do {
                System.out.println(menu);
                System.out.print("Lütfen bir işlem seçiniz : ");
                select = scan.nextInt();
                System.out.println("------------------------------------");

                switch (select) {
                    case 1:
                        plus();
                        break;
                    case 2:
                        minus();
                        break;
                    case 3:
                        times();
                        break;
                    case 4:
                        divided();
                        break;
                    case 5:
                        power();
                        break;
                    case 6:
                        factorial();
                        break;
                    case 7:
                        mod();
                        break;
                    case 8:
                        rectangleArea();
                        break;
                    case 9:
                        rectangleCircumference();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                }
            } while (select != 0);


        }
}
