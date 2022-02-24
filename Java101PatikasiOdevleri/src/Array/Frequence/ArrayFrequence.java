package Array.Frequence;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFrequence {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 5, 5, 8, 2, 3, 1, 1, 9, 6};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            count = 1;
            for (int j = i+1; j < arr.length; j++){
                if ((arr[i] == arr[j]) && !arrayList.contains(arr[i])){
                    count++;
                }
            }
            if (!arrayList.contains(arr[i])) {
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar ediyor.");
            }
            arrayList.add(arr[i]);
        }
    }
}
