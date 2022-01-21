package Array.SumOfArray;

public class sumOfArray {
    public static void main(String[] args) {
        double sum = 0.0;
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            sum += 1.0 / number;
        }
        System.out.println(sum);
    }
}
