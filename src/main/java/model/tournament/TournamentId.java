package model.tournament;

import java.util.UUID;

public class TournamentId {

    private final String value;

    public TournamentId(String value) {
        this.value = value;
    }

    public static TournamentId of(String id) {
        return new TournamentId(id);
    }

    public static TournamentId fromUUID(UUID uuid) {
        return new TournamentId(uuid.toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TournamentId{" +
                "value='" + value + '\'' +
                '}';
    }
}
