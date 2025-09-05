package week1;

import java.util.Scanner;

/*The circumference of a circle is calculated using the formula 2 * pi * radius.
Create a program that asks the user for the radius and then calculates the circumference using the given radius.
Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.*/
public class Ex10 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r =  radius.nextDouble();
        double circumference = 2 * Math.PI * r;
        System.out.println("The circumference of the circle is " + circumference);
    }
}
