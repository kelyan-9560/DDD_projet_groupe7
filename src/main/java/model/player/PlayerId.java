package model.player;

import java.util.Objects;
import java.util.UUID;

public class PlayerId {
    private final String value;

    public PlayerId(String value) {
        this.value = value;
    }

    public static PlayerId of(String id) {
        return new PlayerId(id);
    }

    public static PlayerId fromUUID(UUID uuid) {
        return new PlayerId(uuid.toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PlayerId{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerId playerId = (PlayerId) o;
        return Objects.equals(value, playerId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
