package mypokemons;
import ru.ifmo.se.pokemon.*;

/*Growl lowers the target's Attack by one stage.
Stats can be lowered to a minimum of -6 stages each.*/

public class Growl extends StatusMove {
  public Growl() {
    super();
    accuracy = 1.0;
  }
  protected void applyOppEffects(Pokemon p) {
    p.setMod(Stat.ATTACK, -1);
  }
  protected String describe() { return "used Growl"; }
}
