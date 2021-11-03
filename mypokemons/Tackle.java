package mypokemons;
import ru.ifmo.se.pokemon.*;

/*Tackle is one of the most common and basic moves a Pokémon learns.
 It deals damage with no additional effects.*/

public class Tackle extends PhysicalMove {
   public Tackle() {
     super(Type.NORMAL, 40.0, 1.0);
   }
   protected String describe() { return "used Tackle"; }
}
