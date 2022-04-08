package StringsPractice;

public class StringClass {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("StringBuffer");
        StringBuffer sb2 = new StringBuffer("is a peer class of string");
        StringBuffer sb3 = new StringBuffer("that provides much of");
        StringBuffer sb4 = new StringBuffer("functionality of strings");
        sb1.append( sb2);
        System.out.println( sb1);
        sb1.append( sb3);
        System.out.println(sb1);
        sb1.append( sb4);
        System.out.println(sb1);
        StringBuffer sb5 = new StringBuffer("It is used to  at the specified index position");
        sb5.insert(15,"insert text");
        System.out.println(sb5);
        StringBuffer sb6 = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(sb6.reverse());
    }
}