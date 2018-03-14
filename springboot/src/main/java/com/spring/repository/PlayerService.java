package com.spring.repository;

import com.spring.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
