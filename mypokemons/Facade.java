package mypokemons;
import ru.ifmo.se.pokemon.*;

/*Facade deals damage, and hits with double power (140)
if the user is burned, poisoned or paralyzed.*/

public class Facade extends PhysicalMove {

  public Facade () {
    super(Type.NORMAL, 70.0, 1.0);
  }
  protected double calcBaseDamage(Pokemon att, Pokemon def) {
    if (def.getCondition() == Status.BURN ||
        def.getCondition() == Status.POISON ||
        def.getCondition() == Status.PARALYZE) power *= 2;
    double baseDamage = super.calcBaseDamage(att, def);
    return baseDamage;
  }
  protected String describe() { return "used Facade"; }
}
