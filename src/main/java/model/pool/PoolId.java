package model.pool;

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

}
