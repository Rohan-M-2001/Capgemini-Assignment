package features;

interface math
{
	float perform(float a,float b ,float c);
}
public class q1 {
	public static void main(String[] args) {
		
		var p=13 ; var r=5 ;var t=5;
	    math si = ( a, b, c) -> a*b*c/100;
	    System.out.print("Simple Interest is: " +si.perform(p,r,t));	
}
}