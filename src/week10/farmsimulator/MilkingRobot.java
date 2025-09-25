package week10.farmsimulator;

public class MilkingRobot {
    BulkTank tank;

    public MilkingRobot(){
        this.tank = null;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }

    void milk(Milkable milkable){
        if (this.tank == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            double collectedMilk = milkable.milk();
            this.tank.addToTank(collectedMilk);
        }
    }
}
