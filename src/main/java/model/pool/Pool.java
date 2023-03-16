package model.pool;

import model.player.Player;
import model.tournament.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Pool {

    private int id;
    private List<Player> players;
    private String name;
    private int tournamentId;


    public List<Pool> setUp(Tournament tournament, List<Player> players) {
        List<Pool> pools = new ArrayList<>();
        for (int i = 0; i < players.size()/3; i+=3) {
            var pool = new Pool()
                    .setId(i)
                    .setName("Pool " + i)
                    .setTournamentId(tournament.getId());
            pools.add(pool);
        }
        return pools;
    }

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
