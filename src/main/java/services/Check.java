package services;

import model.admin.Admin;
import model.admin.exception.AdminMissingException;
import model.player.Player;
import model.player.exception.PlayerLicenceNotANumberException;
import model.player.exception.PlayerLicenseNumberMissingException;
import model.player.exception.PlayerNameMissingException;
import model.pool.Pool;
import model.tournament.Tournament;
import model.tournament.exception.TournamentNameMissingException;

import java.util.Objects;

public class Check implements Checking {

    @Override
    public void checkPlayer(Player player) {
        if(Objects.equals(player.getName(), ""))
            throw new PlayerNameMissingException();

        if(Objects.equals(player.getLicenceNumber(), ""))
            throw new PlayerLicenseNumberMissingException();

        try {
            Float.parseFloat(player.getLicenceNumber());
        } catch (NumberFormatException e) {
            throw new PlayerLicenceNotANumberException();
        }
    }

    @Override
    public void checkPool(Pool pool) {
        if(Objects.equals(pool.getName(), "")){
            throw new Pool.PoolNameMissingException();
        }
    }

    @Override
    public void checkTournament(Tournament tournament) {
        if(Objects.equals(tournament.getName(), "")) throw new TournamentNameMissingException();
        tournament.getType().check();
    }

    @Override
    public void checkAdmin(Admin admin) {
        if (Objects.equals(admin.getName(), ""))
            throw new AdminMissingException();
    }

}
