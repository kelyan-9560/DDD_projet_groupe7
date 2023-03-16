package model.pool;

import model.player.Player;

import java.util.List;

public interface PoolRepository {


    Pool save(Pool pool);
    Pool getById(int id);
    void addPlayer(int poolId, Player playerId);
    void addPlayers(int poolId, List<Player> players);

    void deleteById(int id);


}
