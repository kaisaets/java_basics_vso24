package week3;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name =  scan.nextLine();
        System.out.println("Number of characters: " + name.length());
    }
}
