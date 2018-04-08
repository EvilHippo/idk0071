package com.spring.repository;

import com.spring.player.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class PlayerRepositoryTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PlayerRepository playerRepository;


    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void testPlayerGet() {
        Player player = new Player();
        player.setUID(1);
        entityManager.persist(player);
        entityManager.flush();

        Player foundPlayer = playerRepository.findOne(player.getUID());

        assertEquals( player.getUID(), foundPlayer.getUID());
    }

    @Test
    public void testPlayerGetAll() {
        Player player = new Player();
        player.setUID(1);
        Player player2 = new Player();
        player2.setUID(2);
        entityManager.persist(player);
        entityManager.persist(player2);
        entityManager.flush();
        Iterable<Player> foundPlayers = playerRepository.findAll();
        assertEquals("[" + player.toString() + ", " +  player2.toString() + "]", foundPlayers.toString());
    }

    @Test
    public void testPlayerDeleteAll() {
        Player player = new Player();
        player.setUID(1);
        Player player2 = new Player();
        player2.setUID(2);
        entityManager.persist(player);
        entityManager.persist(player2);
        entityManager.flush();
        playerRepository.deleteAll();
        Iterable<Player> foundPlayers = playerRepository.findAll();
        assertEquals("[]", foundPlayers.toString());
    }

    @Test
    public void testPlayerDeleteOnePlayer() {
        Player player = new Player();
        player.setUID(1);
        Player player2 = new Player();
        player2.setUID(2);
        entityManager.persist(player);
        entityManager.persist(player2);
        entityManager.flush();
        playerRepository.delete(player);
        Iterable<Player> foundPlayers = playerRepository.findAll();
        assertEquals("[" + player2.toString() + "]", foundPlayers.toString());
    }

}