package infrasructure;

import model.player.Player;
import model.tournament.Tournament;
import model.tournament.TournamentRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTournamentRepository implements TournamentRepository {
    private static Map<String, Tournament> db = new HashMap<>();

    @Override
    public void save(Tournament tournament) {
        db.put(Integer.toString(tournament.getId()), tournament);
    }

    @Override
    public Tournament getById(int id) {
        return db.get(Integer.toString(id));
    }
}
