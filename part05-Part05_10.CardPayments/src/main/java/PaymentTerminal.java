
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000; // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            money = money + 2.5;
            affordableMeals++;

            return payment - 2.5;
        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            money = money + 4.3;
            heartyMeals++;

            return payment - 4.3;
        } else {
            return payment;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum>=0){
        card.addMoney(sum);
        money += sum;
        }

    }

    public boolean eatAffordably(PaymentCard card) {
       /* if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;

        } else {
            return false;
        }*/
       return card.takeMoney(2.5);
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            heartyMeals++;
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
