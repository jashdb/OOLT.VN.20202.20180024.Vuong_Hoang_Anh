import java.util.Scanner;

class FirstDegreeEquation {
    private double a;
    private double b;

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public String resolve(){
        if(a==0&&b==0) return ("ko co nghiem");
        else return "x = " + -(double)b/a;
    }
}

class SystemFDE {
    private double a11,a12,a21,a22,b1,b2;
    public void seta11(double x){
        this.a11=x;
    }
    public void seta12(double x){
        this.a12=x;
    }
    public void seta21(double x){
        this.a21=x;
    }
    public void seta22(double x){
        this.a22=x;
    }
    public void setb1(double x){
        this.b1=x;
    }
    public void setb2(double x){
        this.b2=x;
    }
    
    public String resolve(){
        double d,d1,d2;
        d=a11*a22-a12*a21;
        d1=b1*a22-b2*a12;
        d2=a11*b2-a21*b1;
        if(d!=0) return "Unique solution \nx1= " + d1/d + "\nx2= " + d2/d;
        else if(d==0&&d1==0&&d2==0) return "Infinitely many solutions";
        else return "No solution";
    }
}

class SecondDegreeEquation{
    private double a,b,c;
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public String resolve(){
        double d=b*b-4*a*c;
        if(d<0) return "No solution";
        else{
            double root=Math.sqrt(d);
            if(d==0) return "Double root x= " +  (-b)/(2*a);
            else return "Two distinct roots \nx1= " + (-b+root)/(2*a) + "\nx2= " + (-b-root)/(2*a);
        }
    }
}
public class Test{
    public static void main(String[] args){
        int choice=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Menu\n1.First Degree Equation ax + b = 0\n2.System of 2-variable First Degree Equation\n\ta11 * x1 + a12 * x2 = b1\n\ta21 * x1 + a22 * x2 = b2\n3.Second Degree Equation a * x^2 + b * x + c = 0 \nChoose?[1-3] ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                FirstDegreeEquation eq1 = new FirstDegreeEquation();
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Nhập a: ");
                eq1.setA(sc1.nextDouble());
                System.out.print("Nhập b: ");
                eq1.setB(sc1.nextDouble());
                System.out.println(eq1.resolve());
                break;
            case 2:
                SystemFDE eq2 = new SystemFDE();
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Nhập a11: ");
                eq2.seta11(sc2.nextDouble());
                System.out.print("Nhập a12: ");
                eq2.seta12(sc2.nextDouble());
                System.out.print("Nhập b1: ");
                eq2.setb1(sc2.nextDouble());
                System.out.print("Nhập a21: ");
                eq2.seta21(sc2.nextDouble());
                System.out.print("Nhập a22: ");
                eq2.seta22(sc2.nextDouble());
                System.out.print("Nhập b2: ");
                eq2.setb2(sc2.nextDouble());
                System.out.println(eq2.resolve());
                break;
            case 3: 
                SecondDegreeEquation eq3 = new SecondDegreeEquation();
                Scanner sc3 = new Scanner(System.in);
                System.out.print("Nhập a: ");
                eq3.setA(sc3.nextDouble());
                System.out.print("Nhập b: ");
                eq3.setB(sc3.nextDouble());
                System.out.print("Nhập c: ");
                eq3.setC(sc3.nextDouble());
                System.out.println(eq3.resolve());
                break;
        }
    }

}


    

 