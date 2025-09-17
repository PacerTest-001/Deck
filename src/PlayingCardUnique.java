public class PlayingCardUnique extends PlayingCard {
    PlayingCardUniqueType type;
    public PlayingCardUnique(PlayingCardUniqueType type, PlayingCardSuit suit) {
        super(suit);
        this.type = type;
    }
    public String toString() {
        String typeString = type.name().toLowerCase().substring(0, 1).toUpperCase() + type.name().toLowerCase().substring(1);
        typeString = typeString.replace("_", " ");
        return typeString + " of " + suit.name().toLowerCase();
    }
}
