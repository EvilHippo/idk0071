package com.spring.player;

import java.util.Comparator;

public class SimplifiedPlayerForLeaderboard {

    private String username;
    private double score;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public SimplifiedPlayerForLeaderboard(String username, double score) {
        this.username = username;
        this.score = score;
    }
    public SimplifiedPlayerForLeaderboard() {

    }


    public static Comparator<SimplifiedPlayerForLeaderboard> scoreComparator = new Comparator<SimplifiedPlayerForLeaderboard>() {

        public int compare(SimplifiedPlayerForLeaderboard player1, SimplifiedPlayerForLeaderboard player2) {

            double scoreForPlayer1 = player1.getScore();
            double scoreForPlayer2 = player2.getScore();


            return (int)(scoreForPlayer2 - scoreForPlayer1);


        }};
}
