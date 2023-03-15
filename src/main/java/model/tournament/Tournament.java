package model.tournament;

public class Tournament {

    private int id;
    private String name;
    private TournamentType type;

    public int getId() {
        return id;
    }

    public Tournament setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Tournament setName(String name) {
        this.name = name;
        return this;
    }

    public TournamentType getType() {
        return type;
    }

    public Tournament setType(TournamentType type) {
        this.type = type;
        return this;
    }
}
