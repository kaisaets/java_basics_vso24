package week3;

import java.util.ArrayList;

public class Ex61 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println("There are this many items in the list: " + countItems(list));
    }
    public static int countItems(ArrayList<String> list) {
        return list.size();
}
}
