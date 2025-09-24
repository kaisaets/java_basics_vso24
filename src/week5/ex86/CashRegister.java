package week5.ex86;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        double price = 2.50; // the price of the economical lunch is 2.50 euros
        if (cashGiven >= 2.50) { // if the given cash is at least the price of the lunch:
            this.cashInRegister += price;//    the price of lunch is added to register
            this.economicalSold++;//    the amount of the sold lunches is incremented by one
            return cashGiven - price;//    the method returns cashGiven - lunch price
        } else {
            return cashGiven;// if not enough money is given, all is returned and nothing else happens
        }
    }

    public double payGourmet(double cashGiven) {
        double price = 4.00; // the price of the gourmet lunch is 4.00 euros
        if (cashGiven >= price) { // if the given cash is at least the price of the lunch:
            this.cashInRegister += price;//    the price of lunch is added to the register
            this.gourmetSold++;//    the amount of the sold lunches is incremented by one
            return cashGiven - price; //    the method returns cashGiven - lunch price
        } else {
            return cashGiven;// if not enough money is given, all is returned and nothing else happens
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double price = 2.50; // the price of the economical lunch is 2.50 euros
        if (card.pay(price)) { // if the balance of the card is at least the price of the lunch:
            this.economicalSold++; //    the amount of sold lunches is incremented by one
            return true; //    the method returns true
        } else {
            return false;// if not, the method returns false
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4.00; // the price of the gourmet lunch is 4.00 euros
        if (card.pay(price)) {// if the balance of the card is at least the price of the lunch:
            this.gourmetSold++;//    the amount of sold lunches is incremented by one
            return true; //    the method returns true
        } else {
            return false; // if not, the method returns false
        }
    }

      public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);       // calls the method in LyyraCard
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

}
