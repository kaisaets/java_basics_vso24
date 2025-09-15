package week1;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter another number: ");
        int secondNumber = sc.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        } else  {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
    }
}
