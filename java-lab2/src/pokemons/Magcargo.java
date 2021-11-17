package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Magcargo extends Slugma {
    public Magcargo() {
        this("Unnamed", 1);
    }

    public Magcargo(String name, int lvl) {
        super(name, lvl);
        this.setStats(60.0, 50.0, 120.0, 90.0, 80.0, 30.0);
        this.addType(Type.ROCK);
        this.addMove(new HydroPump());
    }
}
