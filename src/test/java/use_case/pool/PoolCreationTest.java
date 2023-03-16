package use_case.pool;

import infrasructure.InMemoryPlayerRepository;
import infrasructure.InMemoryPoolRepository;
import model.player.Player;
import model.player.PlayerId;
import model.player.PlayerRepository;
import model.pool.PoolRepository;
import model.tournament.Tournament;
import model.tournament.TournamentType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PoolCreationTest {
    PlayerRepository playerRepository = new InMemoryPlayerRepository();
    PoolRepository poolRepository = new InMemoryPoolRepository();
    

    @Test
    public void must_setup_2_pools(){
        Player player1 = new Player().setId(playerRepository.nextId()).setName("Player 1").setLicenceNumber("1234567890");
        Player player2 = new Player().setId(playerRepository.nextId()).setName("Player 2").setLicenceNumber("1234567890");
        Player player3 = new Player().setId(playerRepository.nextId()).setName("Player 3").setLicenceNumber("1234567890");

        Player player4 = new Player().setId(playerRepository.nextId()).setName("Player 4").setLicenceNumber("1234567890");
        Player player5 = new Player().setId(playerRepository.nextId()).setName("Player 5").setLicenceNumber("1234567890");
        Player player6 = new Player().setId(playerRepository.nextId()).setName("Player 6").setLicenceNumber("1234567890");

        var playersIds = List.of(
                player1.getId(),
                player2.getId(),
                player3.getId(),
                player4.getId(),
                player5.getId(),
                player6.getId()
        );

        var tournament = new Tournament()
                .setId(1)
                .setName("Tournament Test")
                .setType(new TournamentType().setValue("Type 1"));


        PoolCreation poolCreation = new PoolCreation(poolRepository, playerRepository);

        var pools = poolCreation.create(playersIds, tournament.getId());

        assertEquals(2, pools.size());
    }

    @Test
    public void must_create_the_third_pools_with_just_2_players() {
        Player player1 = new Player().setId(playerRepository.nextId()).setName("Player 1").setLicenceNumber("1234567890");
        Player player2 = new Player().setId(playerRepository.nextId()).setName("Player 2").setLicenceNumber("1234567890");
        Player player3 = new Player().setId(playerRepository.nextId()).setName("Player 3").setLicenceNumber("1234567890");

        Player player4 = new Player().setId(playerRepository.nextId()).setName("Player 4").setLicenceNumber("1234567890");
        Player player5 = new Player().setId(playerRepository.nextId()).setName("Player 5").setLicenceNumber("1234567890");
        Player player6 = new Player().setId(playerRepository.nextId()).setName("Player 6").setLicenceNumber("1234567890");

        Player player7 = new Player().setId(playerRepository.nextId()).setName("Player 6").setLicenceNumber("1234567890");
        Player player8 = new Player().setId(playerRepository.nextId()).setName("Player 6").setLicenceNumber("1234567890");

        var playersIds = List.of(
                player1.getId(),
                player2.getId(),
                player3.getId(),
                player4.getId(),
                player5.getId(),
                player6.getId(),
                player7.getId(),
                player8.getId()
        );

        var tournament = new Tournament()
                .setId(1)
                .setName("Tournament Test")
                .setType(new TournamentType().setValue("Type 1"));

        PoolCreation poolCreation = new PoolCreation(poolRepository, playerRepository);

        var pools = poolCreation.create(playersIds, tournament.getId());

        assertEquals(2, pools.get(pools.size()-1).getPlayers().size());
    }
}