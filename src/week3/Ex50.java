package week3;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name  = scan.nextLine();
        if (name.length() >= 2){
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
            }
        }
    }
}
