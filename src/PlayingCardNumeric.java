public class PlayingCardNumeric extends PlayingCard {
    int number;
    public PlayingCardNumeric(int number, PlayingCardSuit suit) {
        super(suit);
        this.number = number;
    }
    public String toString() {
        return Integer.toString(number) + " of " + suit.name().toLowerCase();
    }
}
