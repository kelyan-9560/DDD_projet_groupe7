package use_case.pool;

import model.player.Player;
import model.tournament.Tournament;
import model.tournament.TournamentType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PoolCreationTest {



    @Test
    public void must_setup_2_pools(){
        var players = List.of(
                new Player().setId(1).setName("Player 1").setLicenceNumber("1234567890"),
                new Player().setId(2).setName("Player 2").setLicenceNumber("1234567890"),
                new Player().setId(3).setName("Player 3").setLicenceNumber("1234567890"),

                new Player().setId(4).setName("Player 4").setLicenceNumber("1234567890"),
                new Player().setId(5).setName("Player 5").setLicenceNumber("1234567890"),
                new Player().setId(6).setName("Player 6").setLicenceNumber("1234567890")
        );

        var tournament = new Tournament()
                .setId(1)
                .setName("Tournament Test")
                .setType(new TournamentType().setValue("Type 1"));


        PoolCreation poolCreation = new PoolCreation();

        var pools = poolCreation.create(players, tournament.getId());

        assertEquals(2, pools.size());
    }

    @Test
    public void must_create_the_third_pools_with_just_2_players() {
        var players = List.of(
                new Player().setId(1).setName("Player 1").setLicenceNumber("1234567890"),
                new Player().setId(2).setName("Player 2").setLicenceNumber("1234567890"),
                new Player().setId(3).setName("Player 3").setLicenceNumber("1234567890"),

                new Player().setId(4).setName("Player 4").setLicenceNumber("1234567890"),
                new Player().setId(5).setName("Player 5").setLicenceNumber("1234567890"),
                new Player().setId(6).setName("Player 6").setLicenceNumber("1234567890"),

                new Player().setId(7).setName("Player 7").setLicenceNumber("1234567890"),
                new Player().setId(8).setName("Player 8").setLicenceNumber("1234567890")
        );

        var tournament = new Tournament()
                .setId(1)
                .setName("Tournament Test")
                .setType(new TournamentType().setValue("Type 1"));

        PoolCreation poolCreation = new PoolCreation();

        var pools = poolCreation.create(players, tournament.getId());

        System.out.println(pools.get(pools.size()-1).getId());
        System.out.println(pools.get(pools.size()-1).getName());
        System.out.println(pools.get(pools.size()-1).getTournamentId());
        System.out.println(pools.get(pools.size()-1).getPlayers());

        assertEquals(2, pools.get(pools.size()-1).getPlayers().size());
    }
}