package week8.onlineshop;

public class Purchase {
        private String product;
        private int unitPrice;
        private int amount;

        public Purchase(String product,  int amount, int unitPrice) {
            this.product = product;
            this.unitPrice = unitPrice;
            this.amount = amount;
        }

        public int price(){
            return unitPrice * amount;
        }

        public void increaseAmount(){
            this.amount++;
        }

        public String toString(){
            return this.product +": " + this.amount;
        }

}
