import java.util.ArrayList;

public class CardDeck {
    ArrayList<Card> cards = new ArrayList<Card>();

    public void shuffle() {
        java.util.Collections.shuffle(cards);
    }
}
