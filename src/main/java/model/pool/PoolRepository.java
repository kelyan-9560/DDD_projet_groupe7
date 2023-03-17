package model.pool;

import model.player.Player;

import java.util.List;

public interface PoolRepository {

    Pool save(Pool pool);

    List<Pool> saveAll(List<Pool> pools);
    Pool getById(int id);

    void addPlayer(int poolId, Player player);

    void addPlayers(int poolId, List<Player> players);

    void deleteById(int id);


}
