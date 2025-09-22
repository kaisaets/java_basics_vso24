package week4;

public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    public Product (String nameAtStart, double priceAtStart, int amountAtStart){
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct(){
        System.out.println(nameAtStart + ", price " +  priceAtStart + ", amount " + amountAtStart);
    }
    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }
}
