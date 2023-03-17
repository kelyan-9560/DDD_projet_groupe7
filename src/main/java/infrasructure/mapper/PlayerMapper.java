package infrasructure.mapper;

import model.player.Player;
import model.player.PlayerId;
import model.player.PlayerRepository;

import java.util.ArrayList;
import java.util.List;

public class PlayerMapper {

    private final PlayerRepository playerRepository;

    public PlayerMapper(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> idsToPlayers(List<PlayerId> playerIdList){
        List<Player> playerInPool = new ArrayList<>();
        playerIdList.forEach(playerId -> {
            var player = playerRepository.GetById(playerId);
            playerInPool.add(player);
        });
        return playerInPool;
    }
}
