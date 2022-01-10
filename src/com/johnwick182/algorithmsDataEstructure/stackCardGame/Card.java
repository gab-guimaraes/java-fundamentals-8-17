package com.johnwick182.algorithmsDataEstructure.stackCardGame;

public class Card {
    private int number;
    private ColorCard colorCard;

    public Card(int number, int colorCard) {
        this.number = number;

        if (colorCard == 1)
            this.colorCard = ColorCard.BLUE;
        if (colorCard == 2)
            this.colorCard = ColorCard.BLACK;
        if (colorCard == 3)
            this.colorCard = ColorCard.RED;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ColorCard getColorCard() {
        return colorCard;
    }

    public void setColorCard(ColorCard colorCard) {
        this.colorCard = colorCard;
    }
}

enum ColorCard {
    BLUE,
    RED,
    BLACK,
}
