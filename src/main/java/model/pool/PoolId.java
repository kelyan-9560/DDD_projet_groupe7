package model.pool;

import java.util.Objects;

public class PoolId {

    private final String value;

    public PoolId(String value) {
        this.value = value;
    }

    public static PoolId of(String id) {
        return new PoolId(id);
    }

    public static PoolId fromUUID(java.util.UUID uuid) {
        return new PoolId(uuid.toString());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PoolId{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoolId poolId = (PoolId) o;
        return Objects.equals(value, poolId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
