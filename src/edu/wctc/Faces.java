package edu.wctc;

public enum Faces {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11), QUEEN(12), KING(13)
    ;
    private final int value;
    Faces (int i) {
        this.value = i;
    }
    public int getValue() {return value;}
}
