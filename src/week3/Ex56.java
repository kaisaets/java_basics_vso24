package week3;

import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        // write your code here
        String help = "";

        int i = text.length() - 1;

        while (i >= 0) {
            help += text.charAt(i);
            i--;
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
