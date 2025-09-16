package week2;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int i = 0;
        int result = 0;
        while (number >= i) {
            int power = (int) Math.pow(2, i);
            result += power;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
