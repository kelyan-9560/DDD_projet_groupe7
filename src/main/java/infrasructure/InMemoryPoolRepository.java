package infrasructure;

import model.player.Player;
import model.pool.Pool;
import model.pool.PoolId;
import model.pool.PoolRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryPoolRepository implements PoolRepository {
    private static Map<PoolId,Pool> db = new HashMap<>();
    @Override
    public Pool save(Pool pool) {
        db.put(pool.getId(), pool);
        return pool;
    }

    public List<Pool> saveAll(List<Pool> pools) {
        pools.forEach(pool -> db.put(pool.getId(), pool));
        return pools;
    }

    @Override
    public Pool getById(PoolId id) {
        return db.get(id);
    }

    @Override
    public void addPlayer(PoolId poolId, Player player) {
        this.getById(poolId)
                .getPlayers()
                .add(player);
    }

    @Override
    public void addPlayers(PoolId poolId, List<Player> players) {
    this.getById(poolId).setPlayers(players);
    }

    @Override
    public void deleteById(PoolId id) {
        db.remove(id);
    }
}
