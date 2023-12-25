import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Peer");
        myList.add("Melon");
        myList.add(3,"Peach");
        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.add(1,"Pinapple");
        System.out.println(myList);
        myList.remove(0);
        myList.remove("Melon");
        System.out.println(myList);
        System.out.println(myList.indexOf("Peer"));



    }
}
