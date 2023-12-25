import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Windows");
        mySet.add("Door");
        mySet.add("House");
        mySet.remove(1);
        mySet.add("Door");
        System.out.println(mySet);
    }
}
