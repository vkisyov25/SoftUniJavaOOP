package AbstractionSoftUni.HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private final int multipleNum;

    Season(int multipleNum) {
        this.multipleNum = multipleNum;
    }

    public int getMultipleNum() {
        return multipleNum;
    }
}
