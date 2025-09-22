package week4;

public class DecreasingCounter {
    private int value;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.initialValue;
    }

    public static void main(String[] args) {
        //Ex 75.1 and 75.2
        /*DecreasingCounter counter = new DecreasingCounter(1);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();*/

        //Ex 75.3
        /*DecreasingCounter counter = new DecreasingCounter(100);
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();*/

        //Ex 75.4
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
