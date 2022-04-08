package StringsPractice;

public class StringClass {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('a', '$'));
        System.out.println(str.contains("collection"));
        String str1 = "java string pool refers to collection of strings which are stored in heap memory";
        if (str == str1) {
            System.out.println("SAME");
        } else {
            System.out.println("DIFFERENT");
        }

            if (str.equals(str1)) {
                System.out.println("same");
            } else {
                System.out.println("different");
            }
        }
    }