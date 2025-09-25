package week10.farmsimulator;


import java.util.Random;

public class Cow implements Milkable, Alive {

        private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String name;
    private double udderCapacity = 15 + new Random().nextInt(26);
    private double amount;

    private Random random;

    public Cow (String name){
        this.name = name;
    }

    public Cow(){
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }

    public String getName(){
        return this.name;
    }
    public double getUdderCapacity(){
        return this.udderCapacity;
    }
   public double getAmount(){
        return this.amount;
   }


    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public void liveHour() {
        double produced = 0.7 + (2.0 - 0.7) * new Random().nextDouble();
        this.amount += produced;

        if(this.amount > this.udderCapacity){
            this.amount = this.udderCapacity;
        }
    }

    @Override
    public double milk() {
        double cowsMilk = this.amount;
        this.amount = 0;
        return cowsMilk;
    }

}
