package week4;

import java.util.Scanner;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number){
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum () {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0){
            return 0;
        }
        return (double) this.sum / this.amountOfNumbers;
    }

    public static void main(String[] args) {
        //Ex 79.1
        /*NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());*/

        //Ex 79.2
       /* NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());*/

        //Ex 79.3
        /*Scanner  scan = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            if (number == -1) {
                break;
            } stats.addNumber(number);
        }
        System.out.println("Sum: " +  stats.sum());*/

        //Ex 79.4
        Scanner  scan = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            if (number == -1) {
                break;
            } stats.addNumber(number);

            if (number % 2 == 0){
                evenStats.addNumber(number);
            } else  {
                oddStats.addNumber(number);
            }
        }
        System.out.println("Sum: " +  stats.sum());
        System.out.println("Sum of even: " + evenStats.sum());
        System.out.println("Sum of odd: " + oddStats.sum());

    }
}
