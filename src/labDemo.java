import mypokemons.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class labDemo {
    public static void main(String[] args) {
        Pokemon[] allies = {
                new Slugma("Волк", 3),
                new Togetic("Всеволод", 8),
                new Togekiss("Владимир", 15)
        };
        Pokemon[] foes = {
                new Togepi("Святослав", 4),
                new Magcargo("Радослав", 6),
                new Rayquaza("Ростислав", 15)
        };
        Battle battle = new Battle();
        for (Pokemon p : allies) battle.addAlly(p);
        for (Pokemon p : foes) battle.addFoe(p);
        battle.go();
    }
}
