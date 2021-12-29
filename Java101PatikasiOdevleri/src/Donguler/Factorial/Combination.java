package Donguler.Factorial;
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int inputNumberN, inputNumberR, resultN=1,resultR=1,result=1, i;
        Scanner scan = new Scanner(System.in);

        // C(N,r) N=inputNumberN, r=inputNumberR

        System.out.print("Kombinasyonunun alınmasını istediğiniz sayı : ");
        inputNumberN = scan.nextInt();

        do {
            System.out.print(inputNumberN + " sayısının kaçlı kombinasyonu olsun : ");
            inputNumberR = scan.nextInt();
        }while(inputNumberR > inputNumberN);

        for (i = 1; i <= inputNumberN; i++){
            // N factorial
            resultN *= i;
        }
        for (i = 1; i <= inputNumberR; i++){
            // N factorial
            resultR *= i;
        }
        for (i = 1; i <= (inputNumberN-inputNumberR); i++){
            // N factorial
            result *= i;
        }
        result = resultN /(resultR * result);
        System.out.println(inputNumberN + " sayısının " + inputNumberR + "'li kombinasyonu : " + result);
    }
}
