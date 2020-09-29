package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


public class Card {

    private char suit;

    private int cardValue;

    private String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }


    public int getCardValue() {
        if (cardValue == 1) {
            return 1;
        } else if (cardValue > 1 && cardValue < 10) {
            return cardValue;
        } else {
            return 10;
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(values[cardValue - 1]).append(suit);

        return sb.toString();
    }
}
