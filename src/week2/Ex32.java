package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Until what number?");
        int number = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

    }
}
