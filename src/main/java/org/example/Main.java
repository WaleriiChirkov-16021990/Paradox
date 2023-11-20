package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            new Paradox(500).getStatisticsParadoxIfDoNotChangeChoice();
            new Paradox(500).getStatisticsParadoxIfChangeChoice();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}