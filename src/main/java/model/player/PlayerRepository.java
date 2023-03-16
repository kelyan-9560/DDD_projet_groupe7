package model.player;

import java.util.UUID;

public interface PlayerRepository {
    Player GetById(PlayerId playerId);


    default PlayerId nextId(){
        return PlayerId.fromUUID(UUID.randomUUID());
    }
}
