package model.pool;

import model.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Pool {

    private int id;
    private List<Player> players;
    private String name;
    private int tournamentId;

    private static final int MAX_PLAYER_PER_POOL = 3;

    //TODO : deplacer du code dans la classe Player pour la rendre riche

    public List<Pool> create(int tournamentId) {

        List<Pool> resPools = new ArrayList<>();
        List<Player> playerInPool = new ArrayList<>();

        for (int i = 0; i < players.size(); i++) {
            var player = players.get(i);

            if(playerInPool.size() < MAX_PLAYER_PER_POOL){
                playerInPool.add(player);
            }

            if(playerInPool.size() == MAX_PLAYER_PER_POOL) {
                var pool = new Pool()
                        .setId(i)
                        .setName("Pool " + i)
                        .setTournamentId(tournamentId)
                        .setPlayers(playerInPool);
                resPools.add(pool);

                playerInPool.clear();
            }
        }
        return resPools;
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
