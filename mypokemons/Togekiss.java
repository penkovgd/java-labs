package mypokemons;

public class Togekiss extends Togetic {
    protected WildCharge wildCharge;

    public Togekiss() {
        this("Unnamed", 1);
    }

    public Togekiss(String name, int lvl) {
        super(name, lvl);
        baseHP = 85.0;
        baseAtt = 50.0;
        baseDef = 95.0;
        baseSpAtt = 120.0;
        baseSpDef = 115.0;
        baseSpeed = 80.0;
        this.setStats(baseHP, baseAtt, baseDef, baseSpAtt, baseSpDef, baseSpeed);

        wildCharge = new WildCharge();
        this.addMove(wildCharge);
    }
}
