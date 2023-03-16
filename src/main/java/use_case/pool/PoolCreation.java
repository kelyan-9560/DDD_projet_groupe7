package use_case.pool;

import model.player.Player;
import model.player.PlayerId;
import model.player.PlayerRepository;
import model.pool.Pool;
import model.pool.PoolRepository;

import java.util.ArrayList;
import java.util.List;

public class PoolCreation {


    private final PoolRepository poolRepository;
    private final PlayerRepository playerRepository;

    public PoolCreation(PoolRepository poolRepository, PlayerRepository playerRepository) {
        this.poolRepository = poolRepository;
        this.playerRepository = playerRepository;
    }

    //TODO : Passer les id
    //TODO: injecter les repos


    // TODO: déplacer la logique dans la classe pool

    public List<Pool> create(List<PlayerId> playerIdList, int tournamentId) {
        int peoplePerPool = 3;

        List<Pool> resPools = new ArrayList<>();
        List<Player> playerInPool = new ArrayList<>();

        for (int i = 0; i < playerIdList.size(); i++) {

            var player = playerRepository.GetById(playerIdList.get(i));


            if(playerInPool.size() < peoplePerPool){

                playerInPool.add(player);
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
