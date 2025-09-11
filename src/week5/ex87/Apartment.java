package week5.ex87;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){ //constructor
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){ //method
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        } else {
            return false;
        }
    }
    public int priceDifference (Apartment otherApartment){
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(thisPrice - otherPrice);
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        if (this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter){
            return true;
        } else {
            return false;
        }
    }
}
