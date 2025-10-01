package tools.gasstation.pay.card;

public class GoldenCard extends Card {
    private static final double CONSUME_DISCOUNT = 0.8;
    private static final double DEPOSIT_MIN = 5000.0;

    public GoldenCard() {
        super();
        this.setCardType("Golden Card");
    }

    public GoldenCard(String cardId, String userName, String phoneNum, double cardBalance) {
        super(cardId, userName, phoneNum, "Golden Card", cardBalance);
    }

    public void washCar() {
        System.out.println("Start washing car...");
        System.out.println("Washing car successfully!");
    }
}
