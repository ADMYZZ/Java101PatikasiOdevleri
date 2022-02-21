package Array.ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[input("Dizinin eleman sayısını giriniz : ")];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input("Dizinin "+ (i+1) +". elamanı : ");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int input(String info){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print(info);
        n = sc.nextInt();
        return n;
    }
}
