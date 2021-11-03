package mypokemons;

import ru.ifmo.se.pokemon.*;

public class Rayquaza extends Pokemon {
    protected double baseHP;
    protected double baseAtt;
    protected double baseDef;
    protected double baseSpAtt;
    protected double baseSpDef;
    protected double baseSpeed;
    protected Confide confide;
    protected DoubleTeam doubleTeam;
    protected Growl growl;
    protected Tackle tackle;

    public Rayquaza() {
        this("Unnamed", 1);
    }

    public Rayquaza(String name, int lvl) {
        super(name, lvl);
        baseHP = 40.0;
        baseAtt = 40.0;
        baseDef = 40.0;
        baseSpAtt = 70.0;
        baseSpDef = 40.0;
        baseSpeed = 20.0;
        this.setStats(baseHP, baseAtt, baseDef,
                      baseSpAtt, baseSpDef, baseSpeed);

        this.setType(Type.DRAGON, Type.FLYING);

        confide = new Confide();
        doubleTeam = new DoubleTeam();
        growl = new Growl();
        tackle = new Tackle();
        this.addMove(confide);
        this.addMove(doubleTeam);
        this.addMove(growl);
        this.addMove(tackle);
    }
}
