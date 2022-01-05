package Methods;

public class RecursiveMethod {
    static int f(int n){

        System.out.println("n => " + n);
        if(n == 1){
            return 1;
        }
        int result = n + f(n-1);
        /* Burada result basmaz. Çünkü önce f(n-1) için methoda geri girer. Matruşka bebekleri gibi düşün.
        */
        System.out.println("Result => " + result);
        return result;
    }
    public static void main(String[] args) {
        // Burası f(4) için final değerini verir.
        System.out.println("Fİnal => " + f(4));
    }
}
    /*
        f(4) için çıktısı aşağıdaki gibidir.
        n => 4
        n => 3
        n => 2
        n => 1
        Result => 3
        Result => 6
        Result => 10
        Fİnal => 10

     */
