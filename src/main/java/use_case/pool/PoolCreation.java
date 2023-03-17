package use_case.pool;

import mapper.PlayerMapper;
import model.player.Player;
import model.player.PlayerId;
import model.player.PlayerRepository;
import model.pool.Pool;
import model.pool.PoolRepository;
import model.tournament.TournamentId;

import java.util.ArrayList;
import java.util.List;

public class PoolCreation {

    private final PoolRepository poolRepository;
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PoolCreation(PoolRepository poolRepository, PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.poolRepository = poolRepository;
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }


    public List<Pool> dispatchPlayer(List<PlayerId> playerIdList, TournamentId tournamentId) {
        List<Player> playerInPool = playerMapper.idsToPlayers(playerIdList);

        List<Pool> pools = new Pool()
                .setPlayers(playerInPool)
                .create(tournamentId);

        poolRepository.saveAll(pools);

        return pools;
    }

}
