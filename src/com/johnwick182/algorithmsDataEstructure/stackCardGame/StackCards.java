package com.johnwick182.algorithmsDataEstructure.stackCardGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class StackCards {
    private Stack<Card> cardStack;

    public StackCards() {
        System.out.println("generating cards...");
        cardStack = new Stack<>();

        for (int i=0;i<30;i++) {
            Random randomValue = new Random();
            Random randomColor = new Random();
            int color = randomColor.nextInt(2);
            int value = randomValue.nextInt(13);
            System.out.println("item " + i + " value: " + value);
            Card c1 = new Card(value, value);
            cardStack.push(c1);
        }
    }

    public Card getCard() {
        return cardStack.pop();
    }

}
