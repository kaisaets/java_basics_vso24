package week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        double result = (double)firstNumber / secondNumber;
        System.out.println("Division: " + result);
    }
}
