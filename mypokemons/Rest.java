package mypokemons;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    /* The user goes to sleep for two turns.
     * This fully restores the user’s HP and heals any status conditions.
     */

    Effect restEff;

    public Rest() {
        super();
        type = Type.PSYCHIC;
        restEff = new Effect().condition(Status.SLEEP).turns(2);
    }

    protected void applySelfEffects(Pokemon p) {
        p.addEffect(restEff);
        p.restore();
    }

    protected String describe() {
        return "использует Rest";
    }

}
