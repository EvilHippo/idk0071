package com.spring.repository;

import com.spring.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if(getPlayer(UID).getOpponentUID() != 0) {
            return Optional.of(Arrays.asList(getPlayer(UID), getPlayer(getPlayer(UID).getOpponentUID())));
        } else {
            return Optional.empty();
        }
    }
    public String getAll() {
        String b = "";
        for (Player p :
                playerRepository.findAll()) {
            b += p.toString() + "<br>";

        }
        return b;
    }
}
