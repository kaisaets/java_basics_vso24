package week7.ex4;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    ArrayList<Thing> things = new ArrayList<Thing>();


    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing (Thing thing){
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Thing t : this.things) {
            sum += t.getWeight();
        }
        return sum;
    }

    public void printThings(){
        for (Thing t : this.things){
            System.out.println(t);
        }
    }

    public Thing heaviestThing(){
        if (this.things.size() == 0){
            return null;
        }

        Thing heaviest = this.things.get(0);
        for (Thing t :  this.things) {
            if (t.getWeight() > heaviest.getWeight()) {
                heaviest = t;
            }
        }
            return heaviest;
        }


    public String toString(){
        int count = this.things.size();
        int weight = this.totalWeight();

        if (count == 0){
            return "empty (0 kg)";
        } else if (count == 1){
            return "1 thing (" + weight + " kg)";
        } else {
            return count + " things (" + weight + " kg)";
        }
    }
}
