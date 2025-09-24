package week5.ex90;

public class Player {
    private String name;
    private int goals;

    public Player (String name) {
        this.name = name;
        this.goals = 0;
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName (){
        return this.name;
    }

    public int getGoals (){
        return this.goals;
    }

    public String toString(){
        return this.name + ", goals: " + this.goals;
    }
}
