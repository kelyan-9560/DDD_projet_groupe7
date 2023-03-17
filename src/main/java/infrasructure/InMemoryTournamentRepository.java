package infrasructure;

import model.player.Player;
import model.tournament.Tournament;
import model.tournament.TournamentId;
import model.tournament.TournamentRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTournamentRepository implements TournamentRepository {
    private static Map<TournamentId, Tournament> db = new HashMap<>();

    @Override
    public void save(Tournament tournament) {
        db.put(tournament.getId(), tournament);
    }

    @Override
    public Tournament getById(TournamentId id) {
        return db.get(id);
    }
}
