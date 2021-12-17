package TemelKavramlarVeDegiskenler.ManavKasaProgrami;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,totaPrice;
        double priceArmut = 2.14, priceElma = 3.67, priceDomates = 1.11,
                priceMuz = 0.95, pricePatlican = 5 ;

        System.out.print("Kaç kilo armut aldınız : ");
        armutKg = input.nextDouble();

        System.out.print("Kaç kilo elma aldınız : ");
        elmaKg = input.nextDouble();

        System.out.print("Kaç kilo domates aldınız : ");
        domatesKg = input.nextDouble();

        System.out.print("Kaç kilo muz aldınız : ");
        muzKg = input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız : ");
        patlicanKg = input.nextDouble();

        totaPrice = (armutKg * priceArmut) + (elmaKg * priceElma) + (domatesKg * priceDomates)
                + (muzKg * priceMuz) + (patlicanKg * pricePatlican);


        System.out.println("-----------------------------------------------");
        System.out.println("Toplam tutar : " + totaPrice);
    }
}
