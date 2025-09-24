package week5.ex84;

public class Counter {
    private int value;
    private boolean check;

    public Counter (int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter (int startingValue) {
        this.value = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }

    public Counter() {
        this.value = 0;
        this.check = false;
    }

    public int value () {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void decrease() {

        if (this.check) {
            if(this.value > 0){
                this.value -= 1;
            }
        } else {
            this.value -= 1;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0){
            return;
        } else {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0){
            return;
        } if (this.check){
            this.value -= decreaseAmount;
            if (this.value < 0) {
                this.value = 0;
            }
        } else {
            this.value -= decreaseAmount;
        }
    }
}
