package TemelKavramlarVeDegiskenler.DaireninAlaniVeCevresi;
import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        int r;
        double alan, alfa, cevre, pi =3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenii yarıçapını giriniz : ");
        r = input.nextInt();

        System.out.print("Kaç derecelik alanı tarayalım(0-360 arasında değer giriniz.) : ");
        alfa = input.nextInt();

        alan = (pi * r * r) * (alfa / 360);
        cevre = (2 * pi *r) * (alfa / 360);
        System.out.println(alfa + "Derecelik dairenin alanı : " + alan +"\n"
                           + alfa + "Derecelik dairenin çevresi : " + cevre);


    }
}
