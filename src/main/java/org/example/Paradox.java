package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Paradox {

    private final List<Integer> arr = new LinkedList<>(Arrays.asList(1, 2, 3));
    private final int countGames;
    private final HashMap<String, Integer> result = new HashMap<>();

    public Paradox(int countGames) {
        this.countGames = countGames;
    }

    public void getStatisticsParadoxIfDoNotChangeChoice() {
        if (this.countGames > 0) {
            int game = 0;
            this.result.put("winner", 0);
            this.result.put("looser", 0);
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
                    this.result.put("winner", this.result.get("winner") + 1);
                } else {
                    this.result.put("looser", this.result.get("looser") + 1);
                }
                game++;
            }
            System.out.println("Do not change choices");
            System.out.println("Winner: " + String.valueOf(this.result.get("winner") / (this.countGames / 100)) + " % Looser : " + String.valueOf(this.result.get("looser") / (this.countGames / 100)) + " %");
        } else {
            throw new IllegalArgumentException("Invalid game count. Game count must be more 0");
        }

    }


    public void getStatisticsParadoxIfChangeChoice() {
        if (this.countGames > 0) {
            int game = 0;
            this.result.put("winner", 0);
            this.result.put("looser", 0);
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
                for (int door :
                        secondArr) {
                    if (door != userChoice) {
                        userChoice = door;
                    }
                }
                if (winChoice == userChoice) {
                    this.result.put("winner", this.result.get("winner") + 1);
                } else {
                    this.result.put("looser", this.result.get("looser") + 1);
                }
                game++;
            }
            System.out.println("\n If change choices");
            System.out.println("Winner: " + String.valueOf(this.result.get("winner") / (this.countGames / 100)) + " % Looser : " + String.valueOf(this.result.get("looser") / (this.countGames / 100)) + " %");
        } else {
            throw new IllegalArgumentException("Invalid game count. Game count must be more 0");
        }
    }

    public List<Integer> getArr() {
        return arr;
    }

    public int getCountGames() {
        return countGames;
    }

    public HashMap<String, Integer> getResult() {
        return result;
    }
}
