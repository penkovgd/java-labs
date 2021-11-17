package moves;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {
    /* Swift deals damage and ignores changes to the Accuracy and Evasion stats.
     * However, it will not hit Pokemon during the invulnerable stage of Bounce,
     * Dig, Dive, Fly, Shadow Force or Sky Drop.
     */

    public Swift() {
        super(Type.NORMAL, 60.0, 1.0);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected String describe() {
        return "использует Swift";
    }
}
