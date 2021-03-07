import java.util.Scanner;

class TwoMatrices{
    public void adding(int a[][], int b[][], int size){
        int[][] C=new int[size][size];
        System.out.println("Sum:");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                C[i][j]=a[i][j]+b[i][j];
                System.out.print(C[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

public class AddMatrices {
    public static void main(String agrs[]){
        TwoMatrices matrix = new TwoMatrices();
        Scanner keyboard = new Scanner(System.in);
        int size;
        System.out.print("Size (in integer,>0): ");
        do{
            size = keyboard.nextInt();
        } while(size<=0);

        int[][] X = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("a[" + i + "][" + j + "] = ");
                X[i][j]=keyboard.nextInt();
            }
        }

        int[][] Y = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("b[" + i + "][" + j + "] = ");
                Y[i][j]=keyboard.nextInt();
            }
        }

        matrix.adding(X, Y, size);
    }
}
