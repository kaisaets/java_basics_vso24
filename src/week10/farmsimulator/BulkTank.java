package week10.farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }
     public BulkTank() {
         this(2000);
     }

     public double getCapacity(){
        return this.capacity;
     }

     public double getVolume(){
        return this.volume;
     }

     public double howMuchFreeSpace(){
        return this.capacity - this.volume;
     }

    public void addToTank(double amount){
        if(amount > this.howMuchFreeSpace()){
            this.volume = this.capacity;
        } else {
            this.volume += amount;
            this.volume = Math.ceil(this.volume);
        }
    }

    public double getFromTank(double amount){
        if(amount > this.volume){
            amount = this.volume;
            this.volume = 0.0;
            return amount;
        } else {
            this.volume = this.volume - amount;
            return amount;
        }
    }

    public String toString(){
        return Math.ceil(this.volume) + "/" + this.capacity;
    }
}
