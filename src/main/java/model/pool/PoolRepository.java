package model.pool;

import model.player.Player;

import java.util.List;
import java.util.UUID;

public interface PoolRepository {

    Pool save(Pool pool);

    List<Pool> saveAll(List<Pool> pools);
    Pool getById(PoolId id);

    void addPlayer(PoolId poolId, Player player);

    void addPlayers(PoolId poolId, List<Player> players);

    void deleteById(PoolId id);

    default PoolId nextId(){
        return PoolId.fromUUID(UUID.randomUUID());
    }


}
