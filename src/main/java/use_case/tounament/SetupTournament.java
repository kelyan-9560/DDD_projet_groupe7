package use_case.tounament;

import jdk.jshell.spi.ExecutionControl;
import model.player.Player;
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

    public Tournament setupTournament(int tournamentId, List<Player> players) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }

}
