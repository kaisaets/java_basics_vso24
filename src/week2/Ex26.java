package week2;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Please enter a number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
                sum += read;
                System.out.println("Sum now: " + sum);

            }


        System.out.println("Sum in the end: " + sum);
    }
}
