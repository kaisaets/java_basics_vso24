package week3;

import java.util.ArrayList;
import java.util.Collections;

public class Ex62 {
    public static void print(ArrayList<String> brothers){
        for (String bro : brothers){
            System.out.println(bro);
        }
    }
    public static void removeLast (ArrayList<String> brothers) {
        if (!brothers.isEmpty()) {
            brothers.remove(brothers.size() - 1);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

        Collections.sort(brothers);

        removeLast(brothers);

        System.out.println(brothers);
    }
}
