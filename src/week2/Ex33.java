package week2;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the last number: ");
        int lastNumber = sc.nextInt();
        int sum = 0;

        while(firstNumber <= lastNumber) {
            sum = sum + firstNumber;
            firstNumber++;
        }
        System.out.println("Sum: " + sum);
    }
}
