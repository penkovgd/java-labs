package mypokemons;
import ru.ifmo.se.pokemon.*;

/*Double Team raises the user's Evasiveness by one stage,
 thus making the user more difficult to hit.*/

public class DoubleTeam extends StatusMove {
  public DoubleTeam() {
    super();
    type = Type.NORMAL;
  }
  protected void applySelfEffects(Pokemon p) {
    p.setMod(Stat.EVASION, 1);
  }
  protected String describe() { return "used Double Team"; }
}
