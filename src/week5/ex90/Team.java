package week5.ex90;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private String name;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if (this.players.size() < this.maxSize){
            this.players.add(player);
        } else {
            System.out.println("16 members already in team");;
        }
    }

    public void printPlayers(){
        for (Player player : this.players){
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : this.players){
            totalGoals += player.getGoals();
        }
        return totalGoals;
    }
}
