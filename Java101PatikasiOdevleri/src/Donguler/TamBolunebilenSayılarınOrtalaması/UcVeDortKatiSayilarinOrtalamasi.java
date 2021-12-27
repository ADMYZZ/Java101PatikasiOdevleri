package Donguler.TamBolunebilenSayılarınOrtalaması;
import java.util.Scanner;

public class UcVeDortKatiSayilarinOrtalamasi {
    public static void main(String[] args) {

        int sayi, sayac=0, toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = input.nextInt();
        for (int i=1; i <= sayi; i++){
            if (i%3 == 0 && i%4 == 0){
                toplam += i;
                sayac++;
            }
        }
        System.out.println("Girdiğiniz sayıya kadar " +
                "3 ve 4 tam bölünebilen sayıların ortalaması : " + (toplam / sayac) );
    }
}
