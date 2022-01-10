package com.johnwick182.algorithmsDataEstructure.stackCardGame;

public class PlayGame {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Welcome to the game...");
        StackCards stackCards = new StackCards();
        Thread.sleep(2000);
        System.out.println("Creating Players");
        Player p1 = new Player("John Wick");
        Player p2 = new Player("Scooby-Doo");
        p1.addCard(stackCards.getCard());
        p2.addCard(stackCards.getCard());
        p1.addCard(stackCards.getCard());
        p2.addCard(stackCards.getCard());
        System.out.println(p1);
        System.out.println(p2);
    }
}
