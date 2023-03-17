package model;

import services.Checking;
import services.Check;

public abstract class Validator<T> {

    public abstract void check(T t);

    public Checking verifier = new Check();
}

