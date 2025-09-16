package week2;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.println("Please enter the first number: ");
        read = input.nextInt();
        sum += read;
        System.out.println("Please enter the second number: ");
        read = input.nextInt();
        sum += read;
        System.out.println("Please enter the third number: ");
        read = input.nextInt();
        sum += read;
        System.out.println("The sum is: " + sum);
    }
}
