package week1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner points = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int n = points.nextInt();
        if (n <= 29){
            System.out.println("Grade: Failed");
        } else if (n >= 30 && n <= 34) {
            System.out.println("Grade: 1");
            }
        else if (n >= 35 && n <= 39) {
            System.out.println("Grade: 2");
        }
        else if (n >= 40 && n <= 44) {
            System.out.println("Grade: 3");
        }
        else if (n >= 45 && n <= 49) {
            System.out.println("Grade: 4");
        }
        else if (n >= 50 && n <= 60) {
            System.out.println("Grade: 5");
        }
        else {
            System.out.println("Invalid number of points");
        }
    }
}
