package model.pool;

import model.player.Player;

import java.util.List;
import java.util.Objects;

public class Pool {

    private int id;
    private List<Player> players;
    private String name;
    private int tournamentId;


    public int getId() {
        return id;
    }

    public Pool setId(int id) {
        this.id = id;
        return this;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Pool setPlayers(List<Player> players) {
        this.players = players;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pool setName(String name) {
        this.name = name;
        return this;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public Pool setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
        return this;
    }

}
