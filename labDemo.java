import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class labDemo {
    public static void main(String[] args) {
        Pokemon[] allies = {
                new Slugma("Волк", 3),
                new Togetic("Всеволод", 5),
                new Togekiss("Владимир", 10)
        };
        Pokemon[] foes = {
                new Togepi("Святослав", 4),
                new Magcargo("Радослав", 10),
                new Rayquaza("Ростислав", 8)
        };
        Battle battle = new Battle();
        for (Pokemon p : allies) battle.addAlly(p);
        for (Pokemon p : foes) battle.addFoe(p);
        battle.go();
    }
}
