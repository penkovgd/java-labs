package mypokemons.pokemons;

import ru.ifmo.se.pokemon.*;
import mypokemons.moves.*;

public class Togetic extends Togepi {
    public Togetic() {
        this("Unnamed", 1);
    }

    public Togetic(String name, int lvl) {
        super(name, lvl);
        this.setStats(55.0, 40.0, 85.0, 80.0, 105.0, 40.0);
        this.addType(Type.FLYING);
        this.addMove(new Swift());
    }
}
