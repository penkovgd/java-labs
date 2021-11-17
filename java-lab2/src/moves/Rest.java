package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    /* The user goes to sleep for two turns.
     * This fully restores the user’s HP and heals any status conditions.
     */

    public Rest() {
        super();
        type = Type.PSYCHIC;
    }

    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2));
        p.restore();
    }

    protected String describe() {
        return "использует Rest";
    }

}
