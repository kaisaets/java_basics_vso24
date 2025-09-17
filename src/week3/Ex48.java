package week3;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name  = scan.nextLine();
        char firstCharacter = name.charAt(0);
        System.out.println("First character: " + firstCharacter);
    }
}
