package KosulluIfadelerVeKodBloklari.EtkinlikOneri;
import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        int heat;
        String output;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            output = "Kayak yapmaya gidebilirsiniz.";
        }else if (heat <= 10){
            output = "Sinemaya gidebilirsiniz";
        }else if (heat <=15){
            output = "Sinema veya pikniğe gidebilirsiniz.";
        }else if (heat <= 25){
            output = "Pikniğe gidebilirsiniz.";
        }else {
            output = "Yüzmeye gidebilirsiniz.";
        }

        System.out.println(output);
    }
}
