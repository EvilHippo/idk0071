package com.spring.controller;



import com.spring.player.Player;
import com.spring.repository.PlayerRepository;
import com.spring.repository.PlayerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class PlayerServiceTest {

    @TestConfiguration
    static class PlayerServiceImplTestContextConfiguration {
        @Bean
        public PlayerService playerService() {
            return new PlayerService();
        }
    }

    @Autowired
    private PlayerService playerService;

    @MockBean
    private PlayerRepository playerRepository;


    private Player player;

    private Player player2;

    @Before
    public void setUpMocksBeforeEachTest() throws Exception {
        player = new Player();
        player.setUID(1);
        player.setReady(true);
        player2 = new Player();
        player2.setUID(2);
        player2.setReady(true);
        Mockito.when(playerRepository.findOne(player.getUID()))
                .thenReturn(player);
        Mockito.when(playerRepository.findOne(player2.getUID()))
                .thenReturn(player2);
        Mockito.when(playerRepository.findAll())
                .thenReturn(Arrays.asList(player, player2));
    }


    @Test
    public void addPlayerInDatabase() {

        playerService.addPlayer(player);
        Mockito.verify(playerRepository).save(player);

    }

    @Test
    public void deletePlayerInDatabase() {

        playerService.deletePlayer(player.getUID());
        Mockito.verify(playerRepository).delete(player.getUID());

    }

    @Test
    public void updatePlayerInDatabase() {
        playerService.updatePlayer(player);
        Mockito.verify(playerRepository).save(player);

    }

    @Test
    public void getPlayerToPlay() {
        List<Player> players = playerService.getPlayersToPlay((long)1).get();
        assertEquals(player.getUID(), players.get(0).getUID());
        assertEquals(player2.getUID(), players.get(1).getUID());
        assertEquals(player2.getUID(), players.get(0).getOpponentUID());
        assertEquals(player.getUID(), players.get(1).getOpponentUID());
    }
    @Test
    public void testCheckGameReadyState() {
        playerService.getPlayersToPlay((long)1);
        assertEquals(true, playerService.checkGameReadyState(1));
    }
    @Test
    public void testCheckGameReadyStateWithWrongUID() {
        playerService.getPlayersToPlay((long)1);
        assertEquals(false, playerService.checkGameReadyState(100));
    }

}