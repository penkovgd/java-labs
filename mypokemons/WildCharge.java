package mypokemons;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    /* Wild Charge deals damage, but the user receives
     * 1/4 of the damage it inflicted in recoil.
     * In other words, if the attack does 100 HP damage
     * to the opponent, the user will lose 25 HP.
     */

    public WildCharge() {
        super(Type.ELECTRIC, 90.0, 1.0);
    }

    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage / 4));
    }

    protected String describe() {
        return "использует Wild Charge";
    }
}
