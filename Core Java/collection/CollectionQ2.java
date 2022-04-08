import java.util.HashSet;

public class CollectionQ2 {
    public static void main(String[] args) {
        HashSet vish=new HashSet<>();
        vish.add("Aditya");
        vish.add("Dev");
        vish.add("Satyam");
        vish.add("Khushal");
        vish.add("Shubham");
        vish.add("Pulkit");
        vish.add("Shivam");
        vish.add("Nehil");

        System.out.println(vish);
        System.out.println(vish.add("Nehil"));
        System.out.println(vish);
    }
}
