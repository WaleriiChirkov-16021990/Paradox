package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Paradox {

    private final List<Integer> arr = new LinkedList<>(Arrays.asList(1, 2, 3));
    private final int countGames;

    public Paradox(int countGames) {
        this.countGames = countGames;
    }

    public void getStatisticsParadoxIfDoNotChangeChoice() {
        if (this.countGames > 0) {

            int game = 0;
            int looser = 0;
            int winner = 0;
            while (game < this.countGames) {
                List<Integer> secondArr = new LinkedList<>();
                secondArr.addAll(this.arr);
                int userIndex = (int) Math.floor(Math.random() * secondArr.size());
                int wonIndex = (int) Math.floor(Math.random() * secondArr.size());
                int removeIndex = 0;
                for (int i = 0; i < this.arr.size(); i++) {
                    if (i != userIndex && i != wonIndex) {
                        removeIndex = i;
                    }
                }
                secondArr.remove(removeIndex);
                if (wonIndex == userIndex) {
                    winner++;
                } else {
                    looser++;
                }
                game++;
            }
            System.out.println("Do not change choices");
            System.out.println("Winner: " + String.valueOf(winner / (this.countGames / 100)) +  " % Looser : " + String.valueOf(looser / (this.countGames / 100)) + " %");
        } else {
            throw new IllegalArgumentException("Invalid game count. Game count must be more 0");
        }

    }


    public void getStatisticsParadoxIfChangeChoice() {
        if (this.countGames > 0) {

            int game = 0;
            int looser = 0;
            int winner = 0;
            while (game < this.countGames) {
                List<Integer> secondArr = new LinkedList<>();
                secondArr.addAll(this.arr);
                int userIndex = (int) Math.floor(Math.random() * secondArr.size());
                int userChoice = secondArr.get(userIndex);
                int wonIndex = (int) Math.floor(Math.random() * secondArr.size());
                int winChoice = secondArr.get(wonIndex);
                int removeIndex = 0;
                for (int i = 0; i < this.arr.size(); i++) {
                    if (i != userIndex && i != wonIndex) {
                        removeIndex = i;
                    }
                }
                secondArr.remove(removeIndex);

                for (int door:
                     secondArr) {
                    if (door != userChoice) {
                        userChoice = door;
                    }
                }
                if (winChoice == userChoice) {
                    winner++;
                } else {
                    looser++;
                }
                game++;
            }
            System.out.println("\n If change choices");
            System.out.println("Winner: " + String.valueOf(winner / (this.countGames / 100)) + " % Looser : " + String.valueOf(looser / (this.countGames / 100)) + " %");
        } else {
            throw new IllegalArgumentException("Invalid game count. Game count must be more 0");
        }
    }
}
