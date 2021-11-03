package mypokemons;
import ru.ifmo.se.pokemon.*;

/*Swift deals damage and ignores changes to the Accuracy and Evasion stats.
 However, it will not hit Pokémon during the invulnerable stage of Bounce,
 Dig, Dive, Fly, Shadow Force or Sky Drop.*/

public class Swift extends SpecialMove {
  public Swift() {
    super(Type.NORMAL, 60.0, 1.0);
  }
  protected boolean checkAccuracy(Pokemon att, Pokemon def) { return true; }
  protected String describe() { return "used Swift"; }
}
