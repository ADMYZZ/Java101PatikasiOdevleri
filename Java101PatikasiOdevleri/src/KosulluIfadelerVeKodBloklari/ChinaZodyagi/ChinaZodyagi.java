package KosulluIfadelerVeKodBloklari.ChinaZodyagi;

import java.util.Scanner;

public class ChinaZodyagi {
    public static void main(String[] args) {
        int year;
        String ans = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz (1984 gibi) : ");
        year = input.nextInt();

        year = year % 12;
        switch (year) {
            case (0) -> ans = "Maymun";
            case (1) -> ans = "Horoz";
            case (2) -> ans = "Köpek";
            case (3) -> ans = "Domuz";
            case (4) -> ans = "Fare";
            case (5) -> ans = "Öküz";
            case (6) -> ans = "Kaplan";
            case (7) -> ans = "Tavşan";
            case (8) -> ans = "Ejderha";
            case (9) -> ans = "Yılan";
            case (10) -> ans = "At";
            case (11) -> ans = "Koyun";
        }
        System.out.println("Çin zodyağı burcunuz : " + ans);
    }
}
