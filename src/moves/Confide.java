package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    /* Confide lowers the target's Special Attack by one stage.
     * Stats can be lowered to a minimum of -6 stages each.
     */

    public Confide() {
        super();
        type = Type.NORMAL;
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    protected String describe() {
        return "использует Confide";
    }
}
