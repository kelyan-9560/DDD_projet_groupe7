package services;

import model.admin.Admin;
import model.player.Player;
import model.pool.Pool;
import model.tournament.Tournament;

public interface Checking {
    void checkPlayer(Player player);
    void checkPool(Pool pool);
    void checkTournament(Tournament tournament);
    void checkAdmin(Admin admin);
}
