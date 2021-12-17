package TemelKavramlarVeDegiskenler.KdvTutari;
import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kdvOrani,kdvTutari,tutar,toplamTutar;

        System.out.print("Fiyatı giriniz : ");
        tutar = input.nextDouble();

        kdvOrani = (tutar <= 1000) ? 0.08 : 0.18;
        kdvTutari = tutar * kdvOrani;
        toplamTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Toplam Tutar : " + toplamTutar);
    }
}
