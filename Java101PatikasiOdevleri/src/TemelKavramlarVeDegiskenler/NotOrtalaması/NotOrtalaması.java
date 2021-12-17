package TemelKavramlarVeDegiskenler.NotOrtalaması;
import java.util.Scanner;

public class NotOrtalaması {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextInt();

        int toplamNot = (mat + fizik + kimya + turkce + tarih + muzik);
        int dersSayisi = 6;
        double ortalama = toplamNot / dersSayisi;
        System.out.println("Ortalamanız : " + ortalama);


        String veri = (ortalama < 60) ? "Sınıfta kaldı." : "Sınıfı geçti." ;
        System.out.println(veri);
    }

}
