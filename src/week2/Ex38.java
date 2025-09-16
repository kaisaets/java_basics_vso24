package week2;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many repetitions?");
        int n = sc.nextInt();
        int i = 0;
        while(i < n) {
            printText();
            i++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
