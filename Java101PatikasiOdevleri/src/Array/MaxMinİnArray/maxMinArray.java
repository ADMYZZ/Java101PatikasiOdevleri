package Array.MaxMinİnArray;

public class maxMinArray {
    public static void main(String[] args) {
        int [] list = {56, 34, 1, 8, 101, -2, -33};
        int max = list[0], min = list[0];

        for (int i = 0 ; i < list.length; i++){
            if (list[i] < min){
                min = list[i];
            }else if(max < list[i]){
                max = list[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
