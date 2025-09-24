package week5.ex85;

public class Reformatory {
    private int weightings;

    public Reformatory() {
        this.weightings = 0;
    }

    public int weight (Person person){
        this.weightings++;
        return person.getWeight();
    }

    public void feed (Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return this.weightings;
    }

}
