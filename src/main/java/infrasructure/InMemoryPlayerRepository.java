package infrasructure;

import model.player.Player;
import model.player.PlayerId;
import model.player.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryPlayerRepository implements PlayerRepository {
    private static Map<PlayerId, Player> db = new HashMap<>();
    @Override
    public Player GetById(PlayerId playerId) {
        return db.get(playerId);
    }
}
