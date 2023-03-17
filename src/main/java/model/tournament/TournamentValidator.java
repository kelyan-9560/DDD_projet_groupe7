package model.tournament;

import model.Validator;
import model.tournament.exception.TournamentException;

public class TournamentValidator extends Validator<Tournament> {
    @Override
    public void check(Tournament tournament) {
        try {
            verifier.checkTournament(tournament);
        } catch (NullPointerException e) {
            throw new TournamentException();
        }
    }
}
