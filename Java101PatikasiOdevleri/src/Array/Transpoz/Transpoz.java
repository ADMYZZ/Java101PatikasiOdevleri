package Array.Transpoz;

public class Transpoz {
    public static void main(String[] args) {
        int[][] mtrx= {{1,2,3},{4,5,6}};

        printMatrix(mtrx);
        printTranpos(mtrx);
    }

    static void printMatrix(int[][] mtrx){
        System.out.println("-----Matris-----");
        for (int[] row : mtrx ){
            for (int coloumn : row){
                System.out.print(" " + coloumn + " ");
            }
            System.out.println();
        }
    }

    static void printTranpos(int[][] mtrx){
        System.out.println("----Transpozu----");
        for (int i = 0; i < mtrx[0].length; i++){
            for (int j = 0; j < mtrx.length; j++){
                System.out.print(" "+ mtrx[j][i] +" ");
            }
            System.out.println();
        }
    }
}
