package exception;
import java.util.Scanner;
public class catchblock {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number1:");
        int a=sc.nextInt();
        System.out.println("enter number2");
        int b= sc.nextInt();
        int c=0;
        try{
            c=a/b;
            System.out.println("Output of division:");
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("NUMBER 2 CANNOT BE 0");
            System.out.println("enter number2");
            int d= sc.nextInt();
            c=a/d;      
            System.out.println(c);
        }
//finally { sc.close();}
        System.out.println("Program ended");
    }     
}