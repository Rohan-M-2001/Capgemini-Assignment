package basic;


	import java.util.Scanner;
public class Assignment1Q1 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int t =0;
    int r = 0 ,s=0;
    t=num;
    while(t>0){
        r=t%10;
        t/=10;
        s+=(r*r*r);
    }
    if(s==num)
    System.out.println(num+ " is an Armstrong Number");
    else
    System.out.println(num + " is not an Armstrong Number");
    }
    }
    


