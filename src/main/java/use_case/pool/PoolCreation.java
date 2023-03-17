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


    public List<Pool> dispatchPlayer(List<PlayerId> playerIdList, int tournamentId) {
        List<Player> playerInPool = new ArrayList<>();
        playerIdList.forEach(playerId -> {
            var player = playerRepository.GetById(playerId);
            playerInPool.add(player);
        });

        List<Pool> pools = new Pool()
                .setPlayers(playerInPool)
                .create(tournamentId);

        poolRepository.saveAll(pools);

        return pools;
    }

}
