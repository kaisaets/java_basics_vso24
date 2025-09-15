package week1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is your age logical?");
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
