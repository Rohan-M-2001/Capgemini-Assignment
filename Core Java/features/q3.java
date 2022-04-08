package features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q3 {


public static void main(String args[]){
	String num = "A quick brown fox jumps over the lazy dog";
	String list[] = num.split(" ");
	
	List<String> list1 = new ArrayList<>();
	list1 = Arrays.asList(list);
	for(String s: list1){
	   System.out.println(s);
	}
	String[] arr = list1.toArray(String[] :: new);
	System.out.println(Arrays.toString(arr));
   }
}