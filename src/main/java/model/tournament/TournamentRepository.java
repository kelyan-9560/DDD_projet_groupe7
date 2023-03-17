package model.tournament;

import java.util.UUID;

public interface TournamentRepository {

    void save(Tournament tournament);

    Tournament getById(TournamentId id);


    default TournamentId nextId(){
        return TournamentId.fromUUID(UUID.randomUUID());
    }

}
