package week2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Up to what number?");
        int input = sc.nextInt();
        while (number <= input) {
            System.out.println(number);
            number++;
        }
    }
}
