package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    /* Facade deals damage, and hits with double power (140)
     * if the user is burned, poisoned or paralyzed.
     * In the case of a burn, the usual attack-halving still
     * occurs so Facade hits with an effective power of 70.
     */

    public Facade() {
        super(Type.NORMAL, 70.0, 1.0);
    }

    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status cond = def.getCondition();
        if (cond.equals(Status.BURN) ||
                cond.equals(Status.POISON) ||
                cond.equals(Status.PARALYZE)) {
            power *= 2;
        }
        return super.calcBaseDamage(att, def);
    }

    protected String describe() {
        return "использует Facade";
    }
}
