package week8.onlineshop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }

    public void add (String product, int price) {
        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        } else {
            basket.put(product, new Purchase(product, 1,  price));
        }
    }

    public int price(){
        int total = 0;
        for (Purchase purchase : basket.values()){
            total += purchase.price();
        }
        return total;
    }

    public void print(){
        for (Purchase purchase : basket.values()){
            System.out.println(purchase);
        }
    }
}
