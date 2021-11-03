package mypokemons;
import ru.ifmo.se.pokemon.*;

public class Togepi extends Pokemon {
  protected double baseHP;
  protected double baseAtt;
  protected double baseDef;
  protected double baseSpAtt;
  protected double baseSpDef;
  protected double baseSpeed;
  protected Type types[];
  protected Facade facade;
  protected Tackle tackle;

  public Togepi() { this("Unnamed", 1); }

  public Togepi(String name, int lvl) {
    super(name, lvl);
    baseHP = 35.0;
    baseAtt = 20.0;
    baseDef = 65.0;
    baseSpAtt = 40.0;
    baseSpDef = 65.0;
    baseSpeed = 20.0;
    this.setStats(baseHP, baseAtt, baseDef, baseSpAtt, baseSpDef, baseSpeed);

    types = new Type[2];
    types[0] = Type.FAIRY;
    this.setType(types[0]);

    facade = new Facade();
    tackle = new Tackle();
    this.addMove(facade);
    this.addMove(tackle);
  }
}
