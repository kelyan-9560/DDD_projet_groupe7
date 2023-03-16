package use_case.pool;

import model.player.Player;
import model.pool.Pool;
import model.pool.PoolRepository;

import java.util.ArrayList;
import java.util.List;

public class PoolCreation {


    //TODO : Passer les id
    //TODO: injecter les repos


    // TODO: déplacer la logiquer dans la classe pool

    public List<Pool> create(List<Player> players, int tournamentId) {
        int peoplePerPool = 3;

        List<Pool> resPools = new ArrayList<>();
        List<Player> playerInPool = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            if(playerInPool.size() < peoplePerPool){
                playerInPool.add(players.get(i));
            }
            if(playerInPool.size() == peoplePerPool) {
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

}
