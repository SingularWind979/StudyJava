package tools.gasstation.pay.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardId;
    private String userName;
    private String phoneNum;
    private String cardType;
    private double cardBalance;
    private static double CONSUME_DISCOUNT;
    private static double DEPOSIT_MIN;

    protected void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void deposit(double amount) {
        if (amount < DEPOSIT_MIN) {
            System.out.println("Deposit " + amount + " failed!");
            System.out.println("The amount of deposit must be greater than " + DEPOSIT_MIN);
        } else {
            System.out.println("Deposit " + amount + " successfully!");
            this.cardBalance += amount;
        }
    }

    public void consume(double amount) {
        if (amount * CONSUME_DISCOUNT > this.cardBalance) {
            System.out.println("Consume " + amount + " failed!");
            System.out.println("The amount of consume must be less than " + this.cardBalance);
        } else {
            System.out.println("Consume " + amount + " successfully!");
            this.cardBalance -= amount * CONSUME_DISCOUNT;
        }
    }

    public void print() {
        System.out.println("--------------------------------------------------");
        System.out.println("Card ID: " + this.cardId);
        System.out.println("User Name: " + this.userName);
        System.out.println("Phone Num: " + this.phoneNum);
        System.out.println("Card Type: " + this.cardType);
        System.out.println("Card Balance: " + this.cardBalance);
        System.out.println("--------------------------------------------------");
    }
}
