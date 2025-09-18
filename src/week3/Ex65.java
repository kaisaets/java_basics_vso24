package week3;

import java.util.ArrayList;

public class Ex65 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList <Integer> lengthsList = new ArrayList<>();
        for (String word : list ){
            lengthsList.add(word.length());
        }

        return lengthsList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }

}
