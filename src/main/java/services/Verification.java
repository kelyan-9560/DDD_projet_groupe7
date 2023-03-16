package services;

import model.address.Address;
import model.admin.Admin;
import model.player.Player;
import model.pool.Pool;
import model.tournament.Tournament;

public interface Verification {
    void checkPlayer(Player player);
    void checkPool(Pool pool);
    void checkTournament(Tournament tournament);
    void checkAdmin(Admin admin);

    void checkAddress(Address address);
}
