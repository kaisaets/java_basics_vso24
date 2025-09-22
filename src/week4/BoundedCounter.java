package week4;

import java.util.Scanner;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10){
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }
    public void setValue(int value) {
        if (value >= 0 &&  value <= this.upperLimit) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
       // BoundedCounter counter = new BoundedCounter(14);

        //System.out.println("Value at start: " + counter );
        //Ex 78.1
        /*int i = 0;
        while ( i < 10) {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }*/

        //Ex 78.2
        /*int i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }*/

        //Ex 78.3
     /*   BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            minutes.next();     // advance minutes
            if (minutes. getValue() == 0) {     // if minutes become zero, advance hours
                hours.next();
            }
            i++;
        }*/

        //Ex 78.4
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine()); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());// read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();

            if (seconds.getValue() == 0 ){
                minutes.next();

                if (minutes.getValue() == 0 ){
                    hours.next();
                }
            }
            i++;
        }

    }
}
