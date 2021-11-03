package mypokemons;

import ru.ifmo.se.pokemon.*;

public class Magcargo extends Slugma {
    protected HydroPump hydroPump;

    public Magcargo() {
        this("Unnamed", 1);
    }

    public Magcargo(String name, int lvl) {
        super(name, lvl);
        baseHP = 60.0;
        baseAtt = 50.0;
        baseDef = 120.0;
        baseSpAtt = 90.0;
        baseSpDef = 80.0;
        baseSpeed = 30.0;
        this.setStats(baseHP, baseAtt, baseDef, baseSpAtt, baseSpDef, baseSpeed);

        types[1] = Type.ROCK;
        this.addType(types[1]);

        hydroPump = new HydroPump();
        this.addMove(hydroPump);
    }
}
