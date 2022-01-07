package Methods.RecursiveFinalExample;
import java.util.Scanner;

public class Example {

    static int picture1(int levelMinus,int levelPlus, int counter){
        if (0 < levelMinus) {
            System.out.print(levelMinus + " ");
            return picture1(levelMinus - 5,levelPlus, counter);
        }else {
            if (levelPlus == counter) {
                System.out.print(counter + " ");
                return levelPlus;
            } else {
                System.out.print(levelPlus + " ");
                return picture1(levelMinus, levelPlus + 5, counter);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int levelPlus, levelMinus, counter;

        do {
            System.out.print("Pozitif bir sayı giriniz : ");
            levelMinus = sc.nextInt();

            counter = levelMinus;
            if (levelMinus % 5 == 0) {
                levelPlus = 0;
            } else {
                levelPlus = (levelMinus % 5) - 5;
            }

        }while (levelMinus < 1);

        picture1(levelMinus, levelPlus, counter);
    }
}
