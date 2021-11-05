package mypokemons.moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    /* Double Team raises the user's Evasiveness by one stage,
     * thus making the user more difficult to hit.
     */

    public DoubleTeam() {
        super();
        type = Type.NORMAL;
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    protected String describe() {
        return "использует Double Team";
    }
}
