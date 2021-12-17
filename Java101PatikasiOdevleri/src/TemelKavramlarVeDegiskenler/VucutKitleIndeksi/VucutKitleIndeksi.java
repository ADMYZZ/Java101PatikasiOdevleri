package TemelKavramlarVeDegiskenler.VucutKitleIndeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args){

        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden, 1.75 gibi, giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        endeks = kilo / (boy * boy);

        System.out.println("----------------------------------------------------------");
        System.out.println("Boy kilo endeksiniz : " + endeks);

    }
}
