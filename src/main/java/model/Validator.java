package model;

import services.Verification;
import services.Verifier;

public abstract class Validator<T> {

    public abstract void check(T t);

    public Verification verifier = new Verifier();
}

