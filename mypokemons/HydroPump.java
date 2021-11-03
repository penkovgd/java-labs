package mypokemons;
import ru.ifmo.se.pokemon.*;

// Hydro Pump deals damage with no additional effect.

public class HydroPump extends SpecialMove {
  public HydroPump() {
    super(Type.WATER, 110.0, 0.8);
  }
  protected String describe() {return "used Hydro Pump"; }
}
