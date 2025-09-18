package week3;

import java.util.ArrayList;

public class Ex66 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList <Integer> lengthsList = new ArrayList<>();
        for (String word : list ){
            lengthsList.add(word.length());
        }

        return lengthsList;
    }
    public static int greatest(ArrayList<Integer> list) {
        // write your code here
        int maximum = list.get(0);
        for (int number : list) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
