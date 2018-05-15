package com.spring.repository;

import com.spring.player.Leaderboard;
import com.spring.player.Player;
import com.spring.player.RegisteredUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public void addPlayer(Player player) {

        playerRepository.save(player);

    }
    public void updatePlayer(Player player) {
        playerRepository.save(player);

    }
    public void deletePlayer(Long UID) {
        playerRepository.delete(UID);

    }
    public Player getPlayer(Long UID) {
        return playerRepository.findOne(UID);

    }
    public Optional<List<Player>> getPlayersToPlay(Long UID) {

        playerRepository.findAll().forEach(player -> {

            if(player.getUID() != UID && player.getOpponentUID() == 0 && getPlayer(UID).getOpponentUID() == 0) {
                player.setOpponentUID(UID);
                getPlayer(UID).setOpponentUID(player.getUID());
                updatePlayer(getPlayer(player.getUID()));
                updatePlayer(getPlayer(UID));
            }

        });


        try {
            if (getPlayer(UID).getOpponentUID() != 0) {
                return Optional.of(Arrays.asList(getPlayer(UID), getPlayer(getPlayer(UID).getOpponentUID())));
            } else {
                return Optional.empty();
            }
        } catch (NullPointerException e) {
            //This means someone is searching for a match that does not exist.
            return Optional.empty();
        }
    }

    public List<RegisteredUser> getAllPlayers() {
        List<RegisteredUser> players = new ArrayList<>();
        for (Player player : playerRepository.findAll()) {
            System.out.println(player.getRegisteredUser());
            players.add(player.getRegisteredUser());

        }
        return players;
    }
    public boolean checkGameReadyState(long UID) {
        try {
            return getPlayer(UID).isReady() && getPlayer(UID).getOpponentUID() != 0 && getPlayer(getPlayer(UID).getOpponentUID()).isReady() && getPlayer(getPlayer(UID).getOpponentUID()).getOpponentUID() != 0;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean checkIfOpponentHasMap(long UID) {
        try {
            return getPlayer(UID).getMap() == null && getPlayer(UID).getOpponentUID() != 0 && getPlayer(getPlayer(UID).getOpponentUID()).getMap() != null && getPlayer(getPlayer(UID).getOpponentUID()).getOpponentUID() != 0;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
    public String getOpponentMap(long UID) {
        return getPlayer(getPlayer(UID).getOpponentUID()).getMap();
    }


    /**
     * Will set game as finished and update the score in the database, needs both players score and UID
     * @param firstPlayerUID first player's UID
     * @param secondPlayerUID second player's UID
     * @param firstPlayerScore first player's Score
     * @param secondPlayerScore second player's score
     */
    public void finishGame(long firstPlayerUID, long secondPlayerUID, double firstPlayerScore, double secondPlayerScore) {
        Player firstPlayer = getPlayer(firstPlayerUID);
        Player secondPlayer = getPlayer(secondPlayerUID);
        firstPlayer.setGameEnded(true);
        secondPlayer.setGameEnded(true);
        firstPlayer.setScore(firstPlayerScore);
        secondPlayer.setScore(secondPlayerScore);
        updatePlayer(firstPlayer);
        updatePlayer(secondPlayer);
    }

    public Leaderboard getLeaderboardOfBestPlayers() {
        Leaderboard leaderboard = new Leaderboard();
        for (Player player : playerRepository.findAll()) {
            if(player.isGameEnded()&& player.getRegisteredUser() != null)
            leaderboard.addPlayerToLeaderboardAsSimplePlayer(player);
        }
        return leaderboard;
    }

    public Leaderboard getPersonalGameHistoryOfPlayer(String registeredUserUserName) {
        Leaderboard leaderboard = new Leaderboard();
        for (Player player : playerRepository.findAll()) {
            if(player.isGameEnded() && player.getRegisteredUser() != null && player.getRegisteredUser().getUsername().equals(registeredUserUserName)) {
                leaderboard.addPlayerToLeaderboardAsSimplePlayer(player);
            }
        }
        return leaderboard;

    }
}
