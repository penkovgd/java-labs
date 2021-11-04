package mypokemons.pokemons;

import ru.ifmo.se.pokemon.*;
import mypokemons.moves.*;

public class Togetic extends Togepi {
    protected Swift swift;

    public Togetic() {
        this("Unnamed", 1);
    }

    public Togetic(String name, int lvl) {
        super(name, lvl);
        baseHP = 55.0;
        baseAtt = 40.0;
        baseDef = 85.0;
        baseSpAtt = 80.0;
        baseSpDef = 105.0;
        baseSpeed = 40.0;
        this.setStats(baseHP, baseAtt, baseDef,
                      baseSpAtt, baseSpDef, baseSpeed);

        types[1] = Type.FLYING;
        this.addType(types[1]);

        swift = new Swift();
        this.addMove(swift);
    }
}
