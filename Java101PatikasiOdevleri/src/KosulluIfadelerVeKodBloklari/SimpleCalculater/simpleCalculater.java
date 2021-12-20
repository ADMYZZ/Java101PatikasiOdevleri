package KosulluIfadelerVeKodBloklari.SimpleCalculater;
import java.util.Scanner;

public class simpleCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        String islem;

        System.out.print("Yapacağınız işlem nedir (+, -, *, /) : ");
        islem = input.nextLine();
        System.out.print("1. sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        sayi2 = input.nextInt();


        switch (islem) {
            case ("+") : {
                sonuc = sayi1 + sayi2;
                System.out.println("--------------------------------");
                System.out.println("Sonuç : " + sonuc);
                break;
            }
            case ("-") : {
                sonuc = sayi1 - sayi2;
                System.out.println("--------------------------------");
                System.out.println("Sonuç : " + sonuc);
                break;
            }
            case ("*") : {
                sonuc = sayi1 * sayi2;
                System.out.println("--------------------------------");
                System.out.println("Sonuç : " + sonuc);
                break;
            }
            case ("/") : {
              /*  if (sayi2 == 0){
                    System.out.println("Sayı sıfıra bölünemez.");
                }
                else {
                    sonuc = sayi1 / sayi2 ;
                    System.out.println(sonuc);
                } */
                System.out.println("--------------------------------");
                String compare = (sayi2 == 0) ? "Sayı sıfıra bölünemez." : "Sonuç :  " + (sayi1 / sayi2);
                System.out.println(compare);
                break;
            }
            default :
                System.out.println("Geçerli bir işlem(4 işlem) türü seçiniz.");
        }
    }
}
