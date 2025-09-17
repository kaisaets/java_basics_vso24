package week3;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scan.nextLine();
        String reversed = "";
        int i = name.length() - 1;

        while (i >= 0) {
            reversed += name.charAt(i);
            i--;
        }
        System.out.println("In reverse order: " + reversed);
    }
}
