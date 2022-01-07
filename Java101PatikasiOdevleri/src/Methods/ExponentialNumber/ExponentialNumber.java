package Methods.ExponentialNumber;
import java.util.Scanner;

public class ExponentialNumber {


    static int exponential(int base, int expo){
        if (expo == 0){
            return  1;
        }else if (expo == 1){
            return base;
        }else {
            return base * exponential(base, expo -1);
        }
    }

    static void answerExpo(){
        Scanner sc = new Scanner(System.in);
        int base, expo;

        System.out.print("Taban değeri : ");
        base = sc.nextInt();
        System.out.print("Üst değeri : ");
        expo = sc.nextInt();
        if (expo < 0 ){
            expo *= -1;
            System.out.println("Cevap => 1/" + exponential(base, expo));
        }else {
            System.out.println("Cevap => " + exponential(base,expo));
        }
    }

    public static void main(String[] args) {
        answerExpo();
    }
}
