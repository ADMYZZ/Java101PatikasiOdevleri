package KosulluIfadelerVeKodBloklari.BurcBulma;
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte month,day;
        String zodiac="";
        boolean isError = false;

        System.out.print("Doğduğunuz ay (1-12) : ");
        month = input.nextByte();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextByte();

        switch (month) {
            case 1:
                if (day < 20 && day > 0) {
                    zodiac = "Oğlak.";
                } else if (day >= 20 && day <= 31) {
                    zodiac = "Kova.";
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day < 19 && day > 0) {
                    zodiac = "Kova.";
                } else if (day >= 19 && day <= 29) {
                    zodiac = "Balık.";
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day < 21 && day > 0) {
                    zodiac = "Balık.";
                } else if (day >= 21 && day <= 31) {
                    zodiac = "Koç.";
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day < 20 && day > 0) {
                    zodiac = "Koç.";
                } else if (day >= 20 && day <= 31) {
                    zodiac = "Boğa.";
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day < 21 && day > 0) {
                    zodiac = "Boğa.";
                } else if (day >= 21 && day <= 31) {
                    zodiac = "İkizler.";
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day < 21 && day > 0) {
                    zodiac = "İkizler.";
                } else if (day >= 21 && day <= 30) {
                    zodiac = "Yengeç.";
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day < 23 && day > 0) {
                    zodiac = "Yengeç.";
                } else if (day >= 23 && day <= 31) {
                    zodiac = "Aslan.";
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day < 23 && day > 0) {
                    zodiac = "Aslan.";
                } else if (day >= 23 && day <= 31) {
                    zodiac = "Başak.";
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day < 23 && day > 0) {
                    zodiac = "Başak.";
                } else if (day >= 23 && day <= 30) {
                    zodiac = "Terazi.";
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day < 23 && day > 0) {
                    zodiac = "Terazi.";
                } else if (day >= 23 && day <= 31) {
                    zodiac = "Akrep.";
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day < 22 && day > 0) {
                    zodiac = "Akrep.";
                } else if (day >= 22 && day <= 30) {
                    zodiac = "Yay.";
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day < 20 && day > 0) {
                    zodiac = "Yay.";
                } else if (day >= 20 && day <= 31) {
                    zodiac = "Oğlak.";
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
                break;

        }
        if (isError){
            System.out.println("Geçerli bir tarih giriniz. ");
        }else {
            System.out.println("Burcunuz " + zodiac);
        }
    }
}
