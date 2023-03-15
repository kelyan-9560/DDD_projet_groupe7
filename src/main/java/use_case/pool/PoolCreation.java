package use_case.pool;

import model.player.Player;
import model.pool.Pool;
import model.pool.PoolRepository;

import java.util.List;

public class PoolCreation {
    private final PoolRepository poolRepository;

    public PoolCreation(PoolRepository poolRepository){
        this.poolRepository = poolRepository;
    }


    public Pool poolCreation(List<Player> players, String name){
        if(name == null){
            //todo error
        }
        if(players.size() != 3){
            //todo error
        }

        return  poolRepository.save(new Pool().setId(1).setPlayers(players).setName(name));
    }

}
