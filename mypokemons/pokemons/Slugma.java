package mypokemons.pokemons;

import ru.ifmo.se.pokemon.*;
import mypokemons.moves.*;

public class Slugma extends Pokemon {
    protected double baseHP;
    protected double baseAtt;
    protected double baseDef;
    protected double baseSpAtt;
    protected double baseSpDef;
    protected double baseSpeed;
    protected Type[] types;
    protected Facade facade;
    protected Confide confide;
    protected Rest rest;

    public Slugma() {
        this("Unnamed", 1);
    }

    public Slugma(String name, int lvl) {
        super(name, lvl);
        baseHP = 40.0;
        baseAtt = 40.0;
        baseDef = 40.0;
        baseSpAtt = 70.0;
        baseSpDef = 40.0;
        baseSpeed = 20.0;
        this.setStats(baseHP, baseAtt, baseDef,
                      baseSpAtt, baseSpDef, baseSpeed);

        types = new Type[2];
        types[0] = Type.FIRE;
        this.setType(types[0]);

        facade = new Facade();
        confide = new Confide();
        rest = new Rest();
        this.addMove(facade);
        this.addMove(confide);
        this.addMove(rest);
    }
}
