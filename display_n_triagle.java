import java.util.Scanner;
class n_triagle {
    private int n;
    public void set_n(int n){
        this.n=n;
    }
    public String resolve(){
        if (n<0) return "ko ton tai tam giac voi n<0";
        else return "Tam giac co chieu cao " + n; 
    }
    public void display(){
        if(n>=0){
            for(int i=0;i<n;i++){
                for (int x=n-1-i;x>=0;x--){
                    System.out.print(" ");
                }
                for (int y=1;y<=2*i+1;y+=1){
                    System.out.print("*");
                }
                for (int z=n-1-i;z>=0;z--){
                    System.out.print(" ");
                }
                System.out.println(i+1);
            }
        }
    }
}

public class display_n_triagle {
    public static void main(String agrs[]){
        Scanner keyboard = new Scanner (System.in);

        System.out.println("What's the height of your triagle?");
        int height = keyboard.nextInt();
        n_triagle triagle = new n_triagle();
        triagle.set_n(height);
        triagle.display();;
    }
}
