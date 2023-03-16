package use_case.tounament;

import model.player.Player;
import model.pool.Pool;
import model.pool.PoolRepository;
import model.tournament.Tournament;
import model.tournament.TournamentRepository;

import java.util.List;

public class SetupTournament {
    private final TournamentRepository tournamentRepository;
    private final PoolRepository poolRepository;


    public SetupTournament(TournamentRepository tournamentRepository, PoolRepository poolRepository) {
        this.tournamentRepository = tournamentRepository;
        this.poolRepository = poolRepository;
    }

    public Tournament setupTournament(int tournamentId, List<Player> players) {
        var tournament = tournamentRepository.getById(tournamentId);

        //var pool = new Pool().setUp(tournament, players);

        for (int i = 0; i < players.size()/3; i+=3) {
            var pool = new Pool()
                    .setId(i)
                    .setName("Pool " + i)
                    .setTournamentId(tournamentId);
            poolRepository.save(pool);

            poolRepository.addPlayers(i, players.subList(i-3, i+1));
        }

        tournamentRepository.save(tournament);
        return tournament;
    }

}
