package week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        System.out.println("Enter the lenght of the first part: ");
        int lenght = scan.nextInt();
        String firstPart = word.substring(0, lenght);
        System.out.println("Result: " + firstPart);

    }
}
