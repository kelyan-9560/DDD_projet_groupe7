package model.player;

import model.Validator;

public class PlayerValidator extends Validator<Player> {
    @Override
    public void check(Player player) {
        try {
            verifier.checkPlayer(player);
        } catch (NullPointerException e) {
            throw new PlayerException();
        }
    }
}
