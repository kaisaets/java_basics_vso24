package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
       while (true) {
           System.out.println("Enter a word: ");
           String word = input.nextLine();
           if (word.isEmpty()) {
               break;
           }
           words.add(word);
       }
        System.out.println("Your words are: ");
       for (String word : words) {
           System.out.println(word);
       }
    }
}
