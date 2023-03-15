package model.tournament;

public interface TournamentRepository {

    void save(Tournament tournament);

    Tournament getById(int id);

}
