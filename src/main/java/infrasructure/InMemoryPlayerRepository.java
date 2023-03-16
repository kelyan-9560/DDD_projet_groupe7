package infrasructure;

import model.player.Player;
import model.player.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryPlayerRepository implements PlayerRepository {
    private static Map<String, Player> db = new HashMap<>();
    @Override
    public Player GetById(int id) {
        return db.get(Integer.toString(id));
    }
}
