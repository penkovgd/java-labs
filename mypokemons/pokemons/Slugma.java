package mypokemons.pokemons;

import ru.ifmo.se.pokemon.*;
import mypokemons.moves.*;

public class Slugma extends Pokemon {
    public Slugma() {
        this("Unnamed", 1);
    }

    public Slugma(String name, int lvl) {
        super(name, lvl);
        this.setStats(40.0, 40.0, 70.0, 40.0, 40.0, 20.0);
        this.setType(Type.FIRE);
        this.setMove(new Facade(), new Confide(), new Rest());
    }
}
