package TemelKavramlarVeDegiskenler.UcgenAlani;
import java.util.Scanner;

public class UcgenOdevi {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double aKenari,bKenari,cKenari,u;

        System.out.print("A kenarını giriniz : ");
        aKenari = input.nextInt();

        System.out.print("B kenarını giriniz : ");
        bKenari = input.nextInt();

        System.out.print("C kenarını giriniz : ");
        cKenari = input.nextInt();

        // Üçgenin alanı için (alan*alan = u * (u-aKenari) * (u-bKenari) * (u-cKenari)) formülünü kullandım.
        u = (aKenari + bKenari + cKenari) / 2;

        // Üçgenin alanını yine u değişkenine atadım. Yeni bir değişken tanımlama gereği duymadım.
        u = Math.sqrt(u * (u-aKenari) * (u-bKenari) * (u-cKenari));
        System.out.println("Üçgenin alanı : " + u);
    }

}
