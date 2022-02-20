package Array.RepeatingEvenNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 5, 5, 8, 2, 3, 1, 1, 9, 6};
        int[] array = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    if (!isFind(array, arr[i]) && (arr[i] % 2 == 0)) {
                        array[index++] = arr[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static boolean isFind(int[] ary, int value){
        boolean isFind = false;
        for(int i : ary){
            if(ary[i] == value){
                isFind = true;
                break;
            }
        }
        return isFind;
    }
}
