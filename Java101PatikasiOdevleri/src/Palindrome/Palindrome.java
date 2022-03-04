package Palindrome;


public class Palindrome {
    public static void main(String[] args) {
        // isPolindrome() girilen sayı veya sözcüğün palindrome olup olmadığını verir.
        // Palindrome ise true değilse false çıktısını verir,
        System.out.println(isPolindrome(145541));
        System.out.println(isPolindrome("asd 5745649897860:,sas dsa"));
    }

    static boolean isPolindrome(String str){
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]","");
        int i = 0, j = str.length()-1;
        boolean is = true;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                is = false;
                break;
            }
            i++;
            j--;
        }
        return is;
    }

    static boolean isPolindrome(int i){
        int counter = i,reverse = 0, lastDigit;

        while (counter != 0){
            lastDigit = counter % 10;
            reverse = (reverse * 10) + lastDigit;
            counter /= 10;
        }
        return reverse == i;
    }
}
