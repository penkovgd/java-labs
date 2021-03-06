package moves;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    /* Growl lowers the target's Attack by one stage.
     * Stats can be lowered to a minimum of -6 stages each.
     */

    public Growl() {
        super();
        accuracy = 1.0;
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }

    protected String describe() {
        return "использует Growl";
    }
}
