import javafx.application.Application;

public class BlackJackUIDriver {

    private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen",
            "king" };

    private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };

    private static final int[] POINT_VALUES = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

    public static void main(String[] args) {
        Deck deck = new Deck(RANKS, SUITS, POINT_VALUES);
        System.out.println(deck);
        BlackJack.play(deck);
        Application.launch(BlackJackUI.class, args);
    }

}
