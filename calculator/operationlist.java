package calculator;
import java.util.Scanner;


public class operationlist implements operations{
    Scanner scan=new Scanner(System.in);
    
    @Override
    public void addition(double a,double b){
        double  sum=a+b;
        System.out.println("the sum is: "+sum);
        System.out.println("--------------------------------------\n");
    }
    
    public void subtracion(double a,double b){
        double  sub=a-b;
        System.out.println("the sub is: "+sub);
        System.out.println("--------------------------------------\n");
        
    }
    
    public void multiplication(double a,double b){
        double  mult=a*b;
        System.out.println("the product is: "+mult);
        System.out.println("--------------------------------------\n");
    }
    
    public void division(double a,double b){
        if(b==0){
            System.out.println("can not divide by 0 ");
            System.out.println("--------------------------------------\n");
            return;
        }
        double  div=a/b;
        System.out.println("the div is: "+div);
        System.out.println("--------------------------------------\n");
    }
    
    public void exit(){
        System.out.println("exit the program...");
        System.exit(0);
    }
        
}
