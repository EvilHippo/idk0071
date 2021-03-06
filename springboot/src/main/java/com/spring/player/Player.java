package com.spring.player;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {

    @Id
    private long UID;

    private long opponentUID = 0;
    private String movement;
    private boolean ready = false;

    @Column(length=100000)
    private String map;
    private String option;
    private String username;
    private boolean gameEnded = false;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "RegisteredUser_id")
    @JsonIgnore
    private RegisteredUser registeredUser;
    private double score = 0;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public long getOpponentUID() {
        return opponentUID;
    }

    public void setOpponentUID(long opponentUID) {
        this.opponentUID = opponentUID;
    }

    public long getUID() {
        return UID;
    }

    public void setUID(long UID) {
        this.UID = UID;
    }


    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Player(long UID) {


        this.UID = UID;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public void setGameEnded(boolean gameEnded) {
        this.gameEnded = gameEnded;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }

    public Player() {

    }
    @Override
    public String toString() {
        return String.format("Player[id=%d, Opid=%d]", UID, opponentUID);
    }
}
