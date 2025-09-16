package week2;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find a factorial of: ");
        int factorialOf = sc.nextInt();
        int i = 1;
        int factorial = 1;

        while (factorialOf >= i) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + factorialOf + " is " + factorial);
    }
}
