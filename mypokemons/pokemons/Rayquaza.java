package mypokemons.pokemons;

import ru.ifmo.se.pokemon.*;
import mypokemons.moves.*;

public class Rayquaza extends Pokemon {
    public Rayquaza() {
        this("Unnamed", 1);
    }

    public Rayquaza(String name, int lvl) {
        super(name, lvl);
        this.setStats(105.0, 150.0, 90.0, 150.0, 90.0, 95.0);
        this.setType(Type.DRAGON, Type.FLYING);
        this.setMove(new Confide(), new DoubleTeam(), new Growl(), new Tackle());
    }
}
