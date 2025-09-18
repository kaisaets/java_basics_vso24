package week3;

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstWord = sc.nextLine();
        System.out.println("Type the second word: ");
        String secondWord = sc.nextLine();

        if (firstWord.indexOf(secondWord) != -1){
        System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
    } else

    {
        System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
    }

    }
}
