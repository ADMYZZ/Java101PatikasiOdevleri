package KosulluIfadelerVeKodBloklari.LeapYear;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        String ans ;

        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol etmek istediğiniz yılı giriniz : " );
        year = input.nextInt();

        if (0 < year) {
            if (year < 1000){
                ans = (year%4 == 0) ? year + " artık yıldır. " : year + " artık yıl değildir. ";
            } else if (year % 400 == 0) {
                ans = year + " artık yıldır. ";
            } else if (!(year % 100 == 0) && (year % 4 == 0)) {
                ans = year + " artık yıldır. ";
            } else {
                ans = year + " artık yıl değildir. ";
            }
        }else {
            ans = "Lütfen geçerli bir tarih giriniz.";
        }
        System.out.println(ans);
    }
}
