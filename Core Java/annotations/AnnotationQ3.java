package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;  
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  

@interface Execute{
	int Sequence();

}
class  MyClass{ 
@Execute(Sequence=2) 
public void myMethod1(){ 
	System.out.println("First");
	
} 
@Execute(Sequence=1) 
public void myMethod2(){ 
	System.out.println("second");
} 
@Execute(Sequence=3) 
public void myMethod3(){ 
	System.out.println("third");
	
} 

}
public class AnnotationQ3 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{ 
		MyClass m = new MyClass();
		Method a=m.getClass().getMethod("myMethod1");
		Method b=m.getClass().getMethod("myMethod2");
		Method c=m.getClass().getMethod("myMethod3");
		Execute a1=a.getAnnotation(Execute.class);
		Execute b1=b.getAnnotation(Execute.class);
		Execute c1=c.getAnnotation(Execute.class);
		System.out.println(a1.Sequence());
		System.out.println(b1.Sequence());
		System.out.println(c1.Sequence());
	
		
}}
