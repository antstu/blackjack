package src.blackjack;

public class Player {


    /**
     * Features of a person when playing blackjack
     */

    private String name;
    private Hand hand;
    private int potValue;
    private int money;
    private int bet;
    private int gamesWon = 0;



    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }



    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        this.hand = new Hand();
    }

    public boolean computerAI(){
        if(getHand().getHandValue() < 16) {
            System.out.println("Computer takes another card");
            return true;
        }

        System.out.println("Computer declines another card");
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBet() {
        return bet;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                ", Games won=" + gamesWon +
                '}';
    }
}
