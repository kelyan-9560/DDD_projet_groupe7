package model.pool;

import model.Validator;

public class PoolValidator extends Validator<Pool> {

    @Override
    public void check(Pool pool) {
        try {
            verifier.checkPool(pool);
        } catch (NullPointerException e) {
            throw new PoolException();
        }
    }
}
