package pokemons;

import moves.*;

public class Togekiss extends Togetic {
    public Togekiss() {
        this("Unnamed", 1);
    }

    public Togekiss(String name, int lvl) {
        super(name, lvl);
        this.setStats(85.0, 50.0, 95.0, 120.0, 115.0, 80.0);
        this.addMove(new WildCharge());
    }
}
