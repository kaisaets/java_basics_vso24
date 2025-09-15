package week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "carrot";


        while (true) {
            System.out.println("Type the password: ");
            String input = sc.nextLine();
            if (input.equals(password)) {
            System.out.println("The secret is: jryy qbar!");
            break;
        } else {
                System.out.println("Wrong password!");
            }
        }
    }
}
