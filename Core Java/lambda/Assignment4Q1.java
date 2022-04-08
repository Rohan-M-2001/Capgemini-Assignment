package lambda;

interface math
    {
    	double perform(int a,int b);
    }

public class Assignment4Q1 {
    public static void main(String[] args) {
   
    int num1=13,num2=5;
    math addition = (int a,int b) -> a + b;
    math subtraction = (int a,int b) -> a - b;
    math multiplication = (int a,int b) -> a * b;
    math division = (int a,int b) -> (a/b) ;

    System.out.println("Addition = " + addition.perform(num1,num2));
    System.out.println("subtraction = " + subtraction.perform(num1,num2));
    System.out.println("multiplication = " + multiplication.perform(num1,num2));
    System.out.println("division = " +division.perform(num1,num2));
    }
}