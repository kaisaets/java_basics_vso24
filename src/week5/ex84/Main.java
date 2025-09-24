package week5.ex84;

public class Main {
    public static void main(String[] args) {
/*        Counter c1 = new Counter(5, true); // start=5, check on
        Counter c2 = new Counter(3);       // start=3, check off
        Counter c3 = new Counter(true);    // start=0, check on
        Counter c4 = new Counter();        // start=0, check off

        c1.decrease();
        c1.decrease();
        c1.decrease();
        c1.decrease();
        c1.decrease();
        c1.decrease(); // should stay at 0 because check is on

        System.out.println("c1 value: " + c1.value()); // 0
        System.out.println("c2 value: " + c2.value()); // 3
        System.out.println("c3 value: " + c3.value()); // 0
        System.out.println("c4 value: " + c4.value()); // 0*/

        Counter c = new Counter(5, true);

        c.decrease(3);
        System.out.println(c.value()); // 2

        c.decrease(10);
        System.out.println(c.value()); // 0 (check prevents negative)

        c.increase(7);
        System.out.println(c.value()); // 7

        c.increase(-5);
        System.out.println(c.value()); // 7 (ignored)

        c.decrease(-2);
        System.out.println(c.value()); // 7 (ignored)
    }
}
