package tools.gasstation.pay.card;

public class SilverCard extends Card {
    private static final double CONSUME_DISCOUNT = 0.9;
    private static final double DEPOSIT_MIN = 2000.0;

    public SilverCard() {
        super();
        this.setCardType("Silver Card");
    }

    public SilverCard(String cardId, String userName, String phoneNum, double cardBalance) {
        super(cardId, userName, phoneNum, "Silver Card", cardBalance);
    }
}

