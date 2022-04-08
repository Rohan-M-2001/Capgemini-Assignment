package StringsPractice;

public class StringClass {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("StringBuffer");
        StringBuilder sb2 = new StringBuilder("is a peer class of string");
        StringBuilder sb3 = new StringBuilder("that provides much of");
        StringBuilder sb4 = new StringBuilder("functionality of strings");
        sb1.append( sb2);
        System.out.println( sb1);
        sb1.append( sb3);
        System.out.println(sb1);
        sb1.append( sb4);
        System.out.println(sb1);
        StringBuilder sb5 = new StringBuilder("It is used to   at the specified index position");
        sb5.insert(15,"insert text");
        System.out.println(sb5);
        StringBuilder sb6 = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(sb6.reverse());
    }
}