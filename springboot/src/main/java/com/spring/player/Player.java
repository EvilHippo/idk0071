package com.spring.player;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {

    @Id
    private long UID;
    private double x;
    private double y;
    private long opponentUID = 0;
    private String movement;
    private boolean ready = false;

    @Column(length=100000)
    private String map;

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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public Player(double x, double y, long UID) {

        this.x = x;
        this.y = y;
        this.UID = UID;
    }
    public Player() {

    }
    @Override
    public String toString() {
        return String.format("Player[id=%d, Opid=%d]", UID, opponentUID);
    }
}
