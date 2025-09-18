package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input =  new Scanner(System.in);
        while(true) {
            System.out.println("Type a word: ");
            String word =  input.nextLine();
            if (words.contains(word)){
                System.out.println("You gave the word " + word + " twice");
                break;

            } words.add(word);

        }
    }
}
