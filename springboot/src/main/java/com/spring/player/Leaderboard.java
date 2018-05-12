package com.spring.player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaderboard {
    private List<SimplifiedPlayerForLeaderboard> simplePlayers = new ArrayList<>();

    public List<SimplifiedPlayerForLeaderboard> getSimplePlayers() {
        return simplePlayers;
    }

    public void setSimplePlayers(List<SimplifiedPlayerForLeaderboard> simplePlayers) {
        this.simplePlayers = simplePlayers;
    }

    public void addPlayerToLeaderboardAsSimplePlayer(Player player) {
        SimplifiedPlayerForLeaderboard simplifiedPlayerForLeaderboard = new SimplifiedPlayerForLeaderboard();
        simplifiedPlayerForLeaderboard.setScore(player.getScore());
        simplifiedPlayerForLeaderboard.setUsername(player.getRegisteredUser().getUsername());
        simplePlayers.add(simplifiedPlayerForLeaderboard);

    }

    public void sort() {
        simplePlayers.sort(SimplifiedPlayerForLeaderboard.scoreComparator);
    }
    public List<SimplifiedPlayerForLeaderboard> getTopNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers > simplePlayers.size()) {
            numberOfPlayers = simplePlayers.size();
        }

        return simplePlayers.subList(0, numberOfPlayers);
    }
}
