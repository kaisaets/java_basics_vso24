package week3;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name  = scan.nextLine();
        int i = 0;
        while (i < name.length()) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i++;
        }
    }
}
