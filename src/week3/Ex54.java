package week3;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        System.out.println("Enter the lenght of the end part: ");
        int length = scan.nextInt();
        int start = word.length() - length;

        String endPart = word.substring(start);
        System.out.println("Result: " + endPart);
    }
}
