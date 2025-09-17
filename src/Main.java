public class Main {
    public static void main(String[] args) {
        PlayingCardDeck deck = new PlayingCardDeck();
        deck.build();
        System.out.println(deck.cards);
    }
}