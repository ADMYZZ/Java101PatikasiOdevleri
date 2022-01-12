import java.util.Scanner;

public class asd {
    public static void main (String[] args) {
        // keep this function call here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        /* Eğer döngü içinde S = sc.nextLıne() yazarsam birinci döngüde boş dönüyor.
        O nedenle S = sc.next() yazdım. */

        while(0 < T){
            String S = sc.next();
            String stringEven="", stringOdd="";

            for(int i = 0; i <= S.length()-1; i += 2){
                stringEven += S.charAt(i);
            }
            for(int k = 1; k <= S.length()-1; k += 2){
                stringOdd += S.charAt(k);
            }
            System.out.println(stringEven +" "+ stringOdd);
            T--;
        }
    }
}
