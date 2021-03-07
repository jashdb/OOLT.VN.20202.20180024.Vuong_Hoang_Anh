import java.util.Scanner;

class NumericArray{
    private final int MAX_NUMBER = 100;
    private int a[] = new int [MAX_NUMBER];
    private int num=100;
    private int i,j,k;

    public void InputFromKeyboard(int x, int y){
        a[y]=x;
    }
    public void elenum(int num){
        this.num=num;
    }
    public String ShowArray(){
        String array="Array: ";
        for (k=0;k<num;k++){
            array+= a[k] + ",";
        }
        return array;
    }
    public String Sorting(){
        //bubble sort
        for (i=num-1;i>=1;i--){
            for (j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        String array="Sorted array: ";
        for (k=0;k<num;k++){
            array+= a[k] + ",";
        }
        return array;
    }

    public int SumArray(){
        int sum=0;
        for(i=0;i<num;i++){
            sum+=a[i];
        }
        return sum;
    } 

    public double AveVal(){
        double average=0;
        for(i=0;i<num;i++){
            average+=(double)a[i]/num;
        }
        return average;
    }
}
public class SortArray {
    public static void main(String agrs[]){
        NumericArray arr = new NumericArray();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Insert your integer array (type -1 to stop):");
        for (int i=0;i<100;i++){
            System.out.println("a[" + i +"] = ");
            int m=keyboard.nextInt();
            arr.InputFromKeyboard(m, i);
            if(m==-1){
                arr.elenum(i);
                break;
            }
        }
        System.out.println(arr.ShowArray());
        System.out.println(arr.Sorting());
        System.out.println("Sum of array elements: " + arr.SumArray() + "\nAverage of array elements: " + arr.AveVal());
    }
}
