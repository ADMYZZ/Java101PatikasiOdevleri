package KosulluIfadelerVeKodBloklari.UcakBiletiFiyati;
import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {

        double biletFiyati, mesafe, age;
        int yolculukTipi;
        String ans1;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınız : ");
        age = input.nextDouble();

        System.out.print("Gideceğiniz mesafe[km. cinsinden] : ");
        mesafe = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();

        if ((mesafe>0) && (0<age) && (age<120)){
            biletFiyati = 0.1 * mesafe;
            if (age <= 12) {
                biletFiyati *= 0.5;
            } else if (age <= 24) {
                biletFiyati -= (biletFiyati * 0.1);
            } else if (65 <= age) {
                biletFiyati -= (biletFiyati * 0.3);
            }
            if (yolculukTipi == 2) {
                biletFiyati = (biletFiyati * 0.8) * 2;
                ans1 = "Bİlet fiyatı : " + biletFiyati;
            }else if (yolculukTipi == 1) {
                ans1 = "Bİlet fiyatı : " + biletFiyati;
            } else {
                ans1 = "Geçerli bir yolculuk tipi seçiniz.";
            }
        }else {
            ans1 = "Lütfen geçerli bir km. ve yaş giriniz.";
        }
        System.out.println(ans1);
    }
}
