package Array.MaxMinİnArray;
import java.util.Arrays;
import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args) {
        int [] list = {15,12,788,1,-1,-778,2,0};
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int input = scan.nextInt();

        answer(list,max(list),min(list),input);
    }

    static int max(int[] list){
        int max = list[0];
        for (int i = 0 ; i < list.length; i++){
            if(max < list[i]){
                max = list[i];
            }
        }
        return max;
    }

    static int min(int[] list){
        int min = list[0];
        for (int i = 0 ; i < list.length; i++){
            if(list[i] < min){
                min = list[i];
            }
        }
        return min;
    }

    static  int upper(int[] list, int input){
        int upper = 0;
        Arrays.sort(list);
        for (int i = 0 ; i < list.length; i++){
            if (list[i] > input){
                upper = list[i];
                break;
            }
        }
        return upper;
    }

    static int lower(int[] list, int input){
        int lower =0;
        Arrays.sort(list);
        for (int i = list.length - 1; 0 <= i; i--){
            if (list[i] < input){
                lower = list[i];
                break;
            }
        }
        return lower;
    }

    static void answer(int[] list, int max, int min, int input){
        if(input < min){
            System.out.println("Girdiğiniz sayı dizinin en küçük değerinden daha küçük. En yakın sayı : " + min);
        }else if (max < input){
            System.out.println("Girdiğiniz sayı dizinin en büyük değerinden daha büyük. En yakın sayı : " + max);
        }else {
            System.out.println(lower(list,input) + " " +upper(list,input));
        }
    }
}
