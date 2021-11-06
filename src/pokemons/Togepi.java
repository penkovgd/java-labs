package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Togepi extends Pokemon {
    public Togepi() {
        this("Unnamed", 1);
    }

    public Togepi(String name, int lvl) {
        super(name, lvl);
        this.setStats(35.0, 20.0, 65.0, 40.0, 65.0, 20.0);
        this.setType(Type.FAIRY);
        this.setMove(new Facade(), new Tackle());
    }
}
