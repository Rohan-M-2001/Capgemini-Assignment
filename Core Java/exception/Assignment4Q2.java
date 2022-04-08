package exception;
import java.util.Scanner;

public class Assignment4Q2 {
         public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number1:");
    int a=sc.nextInt();
    System.out.println("enter number2");
    int b= sc.nextInt();
    try {
        System.out.println(a / b); 
    }
    catch (ArithmeticException e) {
        // Exception handler
        throw new UnsupportedOperationException("Invalid operation for division");
    }

}

}
