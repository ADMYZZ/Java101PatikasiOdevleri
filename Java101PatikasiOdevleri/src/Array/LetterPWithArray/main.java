package Array.LetterPWithArray;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[][] letter= new String[8][8];

        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                if (i == 0 || i == 3){
                    letter[i][j] = " * ";
                }else if (j == 0 || (j == 7 && i <= 3)){
                    letter[i][j] = " * ";
                }else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
