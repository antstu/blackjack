package src.blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    /**
     * A new deck is created at the beginning of the program
     * the Deck is not shuffled, a random card is dealt from deck when deal() is called
     *
     */

    private Card[] cards;
    private ArrayList<Integer> usedCards = new ArrayList<Integer>();
    private char[] suitList = new char[]{'♠', '♦', '♥', '♣'};
    private static int noGamesPlayed = 0;

    public Deck() {

        cards = new Card[52];
        int cardCt = 0;
        for(int suit = 0; suit<=3; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards[cardCt] = new Card(suitList[suit], value);
                cardCt++;
            }
        }

    }


    public void deal(Player player) {

        int rand = (int) (Math.random()*(52));
        noGamesPlayed++;

        if(usedCards.contains(rand)){
            do{
                rand = (int)(Math.random() * 52);
            } while (usedCards.contains(rand));
        }

        Card card = cards[rand];

        Hand currentHand = player.getHand();

        currentHand.addCard(card);

        usedCards.add(rand);


    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                ", Number of Games Played=" + noGamesPlayed +
                '}';
    }
}
