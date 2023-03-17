package infrasructure;

import model.player.Player;
import model.pool.Pool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryPoolRepository implements model.pool.PoolRepository {
    private static Map<String,Pool> db = new HashMap<>();
    @Override
    public Pool save(Pool pool) {
        db.put(Integer.toString(pool.getId()), pool);
        return pool;
    }

    public List<Pool> saveAll(List<Pool> pools) {
        pools.forEach(pool -> db.put(Integer.toString(pool.getId()), pool));
        return pools;
    }

    @Override
    public Pool getById(int id) {
        return db.get(Integer.toString(id));
    }

    @Override
    public void addPlayer(int poolId, Player player) {
        this.getById(poolId)
                .getPlayers()
                .add(player);
    }

    @Override
    public void addPlayers(int poolId, List<Player> players) {
    this.getById(poolId).setPlayers(players);
    }

    @Override
    public void deleteById(int id) {
        db.remove(Integer.toString(id));
    }
}
