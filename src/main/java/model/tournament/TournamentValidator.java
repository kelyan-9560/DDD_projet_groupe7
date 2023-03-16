package model.tournament;

import model.Validator;

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
