package week7.ex4;

import java.util.ArrayList;

public class Container {
    private int maxWeightLimit;
    private ArrayList<Suitcase> container;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase (Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeightLimit) {
            this.container.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase s : this.container) {
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Suitcase s : this.container) {
            s.printThings();
        }
    }

    public String toString(){
        return this.container.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
