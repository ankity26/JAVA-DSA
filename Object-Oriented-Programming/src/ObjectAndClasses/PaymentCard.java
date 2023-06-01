package ObjectAndClasses;

public class PaymentCard {

    double balance;
    String name;

    public PaymentCard(double openingBalance , String name){

        this.balance = openingBalance;
        this.name = name;
    }

    public void addMoney(double amount) {

        if(amount < 0){
            return;
        }
        balance =  balance + amount;
    }

    public String toString(){
        return name + ": The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if(balance > 1){
            balance = balance - 2.60;
        }
    }

    public void eatHeartily() {
        if(balance > 1){
            balance = balance - 4.60;
        }
    }

    public static void main(String[] args) {
        PaymentCard mattsCard = new PaymentCard(30 , "matt");
        PaymentCard paulsCard = new PaymentCard(20 , "paul");

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println(mattsCard);
        System.out.println(paulsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println(mattsCard);
        System.out.println(paulsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println(mattsCard);
        System.out.println(paulsCard);

    }
}
