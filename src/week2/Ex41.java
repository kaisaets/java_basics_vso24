package week2;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        System.out.println("Guess number from 0 to 100!");
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        int guessCount = 0;

        while (true) {
            System.out.println("Your guess: ");
            int guess = scanner.nextInt();
            guessCount++;
            if (number < guess) {
                System.out.println("The number is lesser, guesses made: " + guessCount);
            } else if (number > guess) {
                System.out.println("The number is greater, guesses made: " + guessCount);
            } else {
                System.out.println("Congratulations! You guessed correctly! The number is " + number);
                break;
            }
        }
    }
}
