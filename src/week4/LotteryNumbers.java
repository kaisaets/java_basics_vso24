package week4;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random random =  new Random();
        this.numbers.clear();

        while (this.numbers.size() < 7){
            int number = random.nextInt(39) + 1;
            if (!this.containsNumber(number)){
                this.numbers.add(number);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.print("Lottery numbers: ");
        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
