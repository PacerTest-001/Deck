public class PlayingCardDeck extends CardDeck {
    public void build() {
        for (PlayingCardSuit suit : PlayingCardSuit.values()) {

            for (PlayingCardUniqueType type : PlayingCardUniqueType.values()) {
                cards.add(new PlayingCardUnique(type, suit));
            }

            for (int i = 2; i <= 10; i++) {
                cards.add(new PlayingCardNumeric(i, suit));
            }
        }
    }

    public String getAsString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Card card : cards) {
            stringBuilder.append(card.toString()).append(", ");
        }
        return stringBuilder.toString();
    }
}
