package be.ephec.java.exercice.e04;

import java.util.Random;

public class Game {
    Player p1, p2;
    int maxPoints;
    Random dice = new Random();

    public Game(Player p1, Player p2, int maxPoints) {
        this.p1 = p1;
        this.p2 = p2;
        this.maxPoints = maxPoints;
    }

    public Player playAndReturnWinner() {
        while (p1.getPoints() < maxPoints && p2.getPoints() < maxPoints) {
            playNextRound();
        }
        return (p1.getPoints() >= maxPoints) ? p1 : p2;
    }


    private void playNextRound() {
        int result1, result2;
        do {
            result1 = rollDice();
            result2 = rollDice();
        } while (result1 == result2);

    }

    private int rollDice() {
        return dice.nextInt(6);
    }

}
