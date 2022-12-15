package AbstractionSoftUni.CardsWithPower;

public enum Suits1 {
    //(CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitsPower;

    Suits1(int suitsPower) {
        this.suitsPower = suitsPower;
    }

    public int getSuitsPower() {
        return suitsPower;
    }
}
