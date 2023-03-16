package use_case.pool;

import model.player.Player;
import model.pool.Pool;
import model.pool.PoolRepository;

import java.util.ArrayList;
import java.util.List;

public class PoolCreation {

    public List<Pool> create(List<Player> players, int tournamentId) {
        List<Pool> pools = new ArrayList<>();
        for (int i = 0; i < players.size(); i+=3) {
            var pool = new Pool()
                    .setId(i)
                    .setName("Pool " + i)
                    .setTournamentId(tournamentId);
            pools.add(pool);
        }
        return pools;
    }

}
