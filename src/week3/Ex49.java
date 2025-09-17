package week3;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name  = scan.nextLine();
        char lastCharacter = name.charAt(name.length() - 1);
        System.out.println("Last character: " + lastCharacter);
    }
}
