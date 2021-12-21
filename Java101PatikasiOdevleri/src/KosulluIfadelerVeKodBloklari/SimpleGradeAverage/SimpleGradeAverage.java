package KosulluIfadelerVeKodBloklari.SimpleGradeAverage;
import java.util.Scanner;

public class SimpleGradeAverage {
    public static void main(String[] args) {

        int mat, physic, turkish, chemistry, music, numberOfLessons = 0;
        double gradeAverage = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matemataik notunuzu giriniz : ");
        mat = input.nextInt();
        if (0 <= mat && mat <= 100) {
            gradeAverage += mat;
            numberOfLessons += 1;
        }
        else {System.out.println("Matematik dersinden kaldınız.");}

        System.out.print("Fizik notunuzu giriniz : ");
        physic = input.nextInt();
        if (0 <= physic && physic <= 100) {
            gradeAverage += physic;
            numberOfLessons += 1;
        }
        else {System.out.println("Fizik dersinden kaldınız.");}

        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = input.nextInt();
        if (0 <= turkish && turkish <= 100) {
            gradeAverage += turkish;
            numberOfLessons += 1;
        }
        else {System.out.println("Türkçe dersinden kaldınız.");}

        System.out.print("Kimya notunuzu giriniz : ");
        chemistry = input.nextInt();
        if (0 <= chemistry && chemistry <= 100) {
            gradeAverage += chemistry;
            numberOfLessons += 1;
        }
        else {System.out.println("Kimya dersinden kaldınız.");}

        System.out.print("Müzik notunuzu giriniz : ");
        music = input.nextInt();
        if (0 <= music && music <= 100) {
            gradeAverage += music;
            numberOfLessons += 1;
        }
        else {System.out.println("Müzik dersinden kaldınız.");}

        gradeAverage /= numberOfLessons;

        System.out.println("-----------------------------------");
        String respond = (gradeAverage >= 55) ? "Tebrikler geçtiniz. Ortalamanız : " + gradeAverage :
                "Maalesef ortalamanın altında kaldınız. Ortalamanız : " + gradeAverage;
        System.out.println(respond);

    }
}
