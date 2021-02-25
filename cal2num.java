import java.util.Scanner;
public class cal2num {
    private double a;
    private double b;
    
    public void setA(double a){
        this.a=a;
    }

    public void setB(double b){
        this.b=b;
    }

    public String showresult(){
        return "a + b = " + (a+b) + "\na - b = " + (a-b) + "\na * b = " + (a*b) + "\na / b = " + (a/b);
    }
    public static void main(String[] args){
        cal2num newset= new cal2num();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        newset.setA(Double.parseDouble(sc.nextLine()));
        System.out.print("Nhập b: ");
        newset.setB(Double.parseDouble(sc.nextLine()));
        System.out.println(newset.showresult());
    }
    
}
