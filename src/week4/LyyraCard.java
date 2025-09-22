package week4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString(){
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance = this.balance - 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount < 0){
            return;
        }

        this.balance += amount;

        if (this.balance > 150.00) {
            this.balance = 150.00;
        }
    }

    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(10);
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

       // Ex 77.1
        System.out.println(card);

        //Ex 77.2
        /*card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);*/

        //Ex 77.3
       /* card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);*/

        //Ex 77.4
      /*  card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);*/

        //Ex 77.5
/*
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);*/

        //Ex 77.6

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka" + cardPekka);
        System.out.println("Brian" + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka" + cardPekka);
        System.out.println("Brian" + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka" + cardPekka);
        System.out.println("Brian" + cardBrian);
    }
}
