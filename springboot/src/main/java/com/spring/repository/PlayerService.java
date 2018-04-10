package com.spring.repository;

import com.spring.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>();
        for (Player player : playerRepository.findAll()) {
            players.add(player);

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
}
