package calculator;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Calculator {
    public static void input(Double[] nb){
        Scanner scan =new Scanner(System.in);
        
        try{//try the code to prevent app crashing
            System.out.println("enter the first number: ");
            nb[0]=scan.nextDouble();
        }
        catch(InputMismatchException exp){//handelling the input mismatch exception
            System.out.println("input Mismatch !!");
            return;
        }
        
        try{//try the code to prevent app crashing
            System.out.println("enter the second number: ");
            nb[1]=scan.nextDouble();
        }
        catch(InputMismatchException exp){//handelling the input mismatch exception
            System.out.println("input Mismatch !!");
        }
    }

    public static void main(String[] args) {
        Double a ;
        Double b ;
        Double[] nb = new Double[2];
        Scanner scan=new Scanner(System.in);
        operationlist op=new operationlist();
        
         while(true){//making a while loop to keep the app running unless the user askes that 
            
            System.out.println("1 - addition");
            System.out.println("2 - subtraction");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            System.out.println("5 - exit");
            System.out.println("enter the index of the task you want : ");
            int x=scan.nextInt();
            System.out.println("\n");
            
            switch (x) {//using switch instead of nested if-else statments to organize the code 
                case 1:
                    input(nb);
                    a=nb[0];
                    b=nb[1];
                    op.addition(a, b);
                    break;
                case 2:
                    input(nb);
                    a=nb[0];
                    b=nb[1];
                    op.subtracion(a,b);
                    break;
                case 3:
                    input(nb);
                    a=nb[0];
                    b=nb[1];
                    op.multiplication(a,b);
                    break;
                case 4:
                    input(nb);
                    a=nb[0];
                    b=nb[1];
                    op.division(a,b);
                    break;
                case 5:
                    op.exit();
                    break;
                default:
                    System.out.println("wrong input !!\n");
                    
            }
        }
    }
    
}
