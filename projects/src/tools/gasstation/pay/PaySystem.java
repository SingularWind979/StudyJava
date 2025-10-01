package tools.gasstation.pay;

import tools.gasstation.pay.card.Card;
import tools.gasstation.pay.card.GoldenCard;
import tools.gasstation.pay.card.SilverCard;

import java.util.Scanner;

public class PaySystem {
    public static void main(String[] args) {
        GoldenCard gc = new GoldenCard();
        SilverCard sc = new SilverCard();

        test1(gc);
        test1(sc);
    }

    public static void test1(Card c) {
        System.out.println(c);
        c.deposit(5000);
        System.out.println(c);
        c.consume(10000);
        double amount;
        try(Scanner sc = new Scanner(System.in)){
            amount = sc.nextDouble();
            System.out.println("请输入消费金额：");
            c.consume(amount);
        }

        System.out.println(c);
        System.out.println(c);
        c.print();
        if(c instanceof GoldenCard gc){
            if(amount > 500) {
                gc.washCar();
            }
        }
    }


}
