package MineField;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MineSweeper mee = new MineSweeper(input("Satır sayısı(2'den büyük bir sayı giriniz) : "),
                input("Sütun sayısı(2'den büyük bir sayı giriniz) : "));
        mee.run();
    }

    static int input(String s){
        int i;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(s);
            i = sc.nextInt();
        }while (i < 3);
        return i;
    }
}
