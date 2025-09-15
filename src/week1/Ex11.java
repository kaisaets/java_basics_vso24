package week1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter another number: ");
        int secondNumber = sc.nextInt();
        System.out.println("The bigger number of the two numbers given is: " + Math.max(firstNumber, secondNumber));
    }
}
