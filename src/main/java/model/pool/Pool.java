package model.pool;

import model.player.Player;
import model.tournament.TournamentId;

import java.util.ArrayList;
import java.util.List;

public class Pool {

    private PoolId id;
    private List<Player> players;
    private String name;
    private TournamentId tournamentId;
    private static final PoolValidator validator = new PoolValidator();

    private static final int MAX_PLAYER_PER_POOL = 3;

    public Pool(PoolId id, List<Player> players, String name, TournamentId tournamentId) {
        this.id = id;
        this.players = players;
        this.name = name;
        this.tournamentId = tournamentId;
    }

    public List<Pool> create(TournamentId tournamentId) {

        List<Pool> resPools = new ArrayList<>();
        List<Player> playerInPool = new ArrayList<>();

        for (int i = 0; i < players.size(); i++) {
            var player = players.get(i);

            if(playerInPool.size() < MAX_PLAYER_PER_POOL){
                playerInPool.add(player);
            }

            if(playerInPool.size() == MAX_PLAYER_PER_POOL) {
                var pool = new Pool(
                        PoolId.fromUUID(java.util.UUID.randomUUID()),
                        playerInPool,
                        "Pool " + i,
                        tournamentId
                );


                resPools.add(pool);

                playerInPool.clear();
            }
        }
        return resPools;
    }

    public PoolId getId() {
        return id;
    }

    public Pool setId(PoolId id) {
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

    public TournamentId getTournamentId() {
        return tournamentId;
    }

    public Pool setTournamentId(TournamentId tournamentId) {
        this.tournamentId = tournamentId;
        return this;
    }

}
