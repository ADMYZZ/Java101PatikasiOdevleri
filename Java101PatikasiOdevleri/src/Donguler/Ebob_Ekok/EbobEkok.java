package Donguler.Ebob_Ekok;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2, counter = 1, ebob = 1 , ekok = 1;
        boolean session = true;

        do {
            System.out.print("Birinci sayıyı giriniz : ");
            number1 = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            number2 = scan.nextInt();

            if (number1>0 && number2>0) {
                while ((counter < number1) && (counter < number2)) {
                    if ((number1 % counter == 0) && (number2 % counter == 0)) {
                        ebob = counter;
                    }
                    counter++;
                }

                counter = number1 * number2;

                while (number1 < counter && number2 < counter) {
                    if ((counter % number1 == 0) && (counter % number2 == 0)) {
                        ekok = counter;
                    }
                    counter--;
                }

                // Eğer sayılar 3 ve 9 gibi girilirse bu sorgulama olmayınca yanlış veri veriyor.
                if (number1 % number2 == 0 || number2 % number1 == 0){
                    ekok /= 2;
                    if(number1 > number2){
                        ebob = number2;
                    }else {
                        ebob = number1;
                    }
                }


                // ekok = (number1 * number2) / ebob şeklinde de ekok bulunabilir.
                System.out.println("----------------------------------------------");
                System.out.println(number1 + " ve " + number2 + " Ebob'u : " + ebob);
                System.out.println(number1 + " ve " + number2 + " Ekok'u : " + ekok);
                session = false;

            }else {
                System.out.println("Lütfen pozitif sayı giriniz.");
            }
        }while(session);
    }
}
