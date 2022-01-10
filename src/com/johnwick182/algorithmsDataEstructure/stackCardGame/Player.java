package com.johnwick182.algorithmsDataEstructure.stackCardGame;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> playerHand;
    private int sumCards;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerHand=" + playerHand +
                ", sumCards=" + sumCards +
                '}';
    }

    public Player(String name) {
        this.name = name;
        this.playerHand = new ArrayList<>();
        this.sumCards = 0;
    }

    public int addCard(Card card) {
        playerHand.add(card);
        sumCards += card.getNumber();
        return this.sumCards;
    }

}
