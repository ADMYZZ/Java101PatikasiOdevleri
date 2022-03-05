package MineField;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;

    MineSweeper(int row, int column){
        this.row = row;
        this.column = column;
    }

    void run(){
        String[][] field = new String[this.row][this.column];
        String[][] control = new String[this.row][this.column];
        for (String[] strings : field) {
            Arrays.fill(strings, "-");
        }
        for (String[] strings : control) {
            Arrays.fill(strings, "-");
        }
        random(field);
        fillField(field);

        // Buradan altı kullanıcıdan değer alıp control arrayinde kontrol ediyor.
        int size = (this.row * this.column);
        size = size - (size / 4);
        //print(field);
        while (0 < size){
            System.out.println("===================");
            int i = input("Satır : ");
            int j = input("Sütun : ");
            if ((i<1 || field.length<i) || (j<1 || field.length<j)){
                System.out.println("Lütfen geçerli satır-sütun sayısı giriniz.");
                continue;
            }
            control[i-1][j-1] = field[i-1][j-1];
            if (control[i-1][j-1].equals("*")){
                System.out.println("===================");
                print(control);
                System.out.println("Game Over");
                break;
            }else{
                size--;
                print(control);
                if (size == 0){
                    System.out.println("===================");
                    System.out.println("Tebrikler kazandınız.");
                    print(field);
                }
            }
        }
    }

    void random(String[][] field){
        // Arraye rastgele mayın yerleştiriyor.
        int mineAmaount;
        mineAmaount = this.row * this.column;
        mineAmaount /= 4;
        do {
            Random rn = new Random();
            int a = rn.nextInt(this.row);
            int b = rn.nextInt(this.column);
            if (!field[a][b].equals("*")){
                field[a][b] = "*";
                mineAmaount--;
            }
        }while (0 < mineAmaount);
    }

    void fillField(String[][] field){
        //Arrayin mayın olamayan yerlerini etrafındaki mayın sayısı kadar değer verip dolduruyor.
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++){
                if (field[i][j].equals("*")){
                    continue;
                }
                field[i][j] = checkMine(field,i,j);
            }
        }
    }

    String checkMine(String[][] field,int i, int j){
        //i ve j alanının etrafındaki mayınları kontrol edip fillField fonksiyonuna değer döndürüyor.
        int count = 0;
        for (int k  = i-1; k <= i+1; k++){
            for (int l = j-1; l <= j+1; l++){
                if ((i!=k || j!=l) && (0<=k && k<field.length) && (0<=l && l<field.length)){
                    if (field[k][l].equals("*")){
                        count++;
                    }
                }
            }
        }
        return String.valueOf(count);
    }

    void print(String[][] field){
        //Arrayleri ekrana yazdırıyor.
        for (String[] i : field) {
            for(String j : i){
                System.out.print(" "+ j +" ");
            }
            System.out.println();
        }
    }

     int input(String s){
        //Kulllanıcıdan satır ve sütun sdeğerlerini alırken kullanıyor.
        int i;
            Scanner sc = new Scanner(System.in);
            System.out.print(s);
            i = sc.nextInt();
        return i;
    }
}
