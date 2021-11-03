package mypokemons;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    /* Tackle is one of the most common and basic moves a Pokemon learns.
     * It deals damage with no additional effects.
     */

    public Tackle() {
        super(Type.NORMAL, 40.0, 1.0);
    }

    protected String describe() {
        return "used Tackle";
    }
}
