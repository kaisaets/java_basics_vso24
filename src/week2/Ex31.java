package week2;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter last number: ");
        int lastNumber = sc.nextInt();
        int number = firstNumber;

        while (number <= lastNumber) {
            System.out.println(number);
            number++;

        } if (firstNumber >= lastNumber) {
            System.out.println("First: " + firstNumber + "\nLast: " + lastNumber);
        }
    }
}
