package moves;

import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
    // Hydro Pump deals damage with no additional effect.

    public HydroPump() {
        super(Type.WATER, 110.0, 0.8);
    }

    protected String describe() {
        return "использует Hydro Pump";
    }
}
