package services;

import model.address.Address;
import model.address.AddressCityMissingException;
import model.address.AddressStreetMissingException;
import model.address.AddressZipCodeMissingException;
import model.admin.Admin;
import model.admin.AdminMissingException;
import model.player.Player;
import model.player.PlayerLicenseNumberMissingException;
import model.player.PlayerNameMissingException;
import model.pool.Pool;
import model.pool.PoolNameMissingException;
import model.tournament.Tournament;
import model.tournament.TournamentNameMissingException;

import java.util.Objects;

public class Verifier implements Verification{

    @Override
    public void checkPlayer(Player player) {
        if(Objects.equals(player.getName(), ""))
            throw new PlayerNameMissingException();
        if(Objects.equals(player.getLicenceNumber(), ""))
            throw new PlayerLicenseNumberMissingException();
    }

    @Override
    public void checkPool(Pool pool) {
        if(Objects.equals(pool.getName(), "")){
            throw new PoolNameMissingException();
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
