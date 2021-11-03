import mypokemons.*;
import ru.ifmo.se.pokemon.*;

class labDemo {
    public static void main(String[] args) {
        Pokemon[] allies = {
                new Slugma("Слугма", 5),
                new Togetic("Тогетик", 10),
                new Rayquaza("Райкваза", 15)
        };
        Pokemon[] foes = {
                new Togepi("Тогепи", 5),
                new Magcargo("Магкарго", 10),
                new Togekiss("Тогекисс", 15)
        };

        Battle battle = new Battle();
        for (Pokemon p : allies) battle.addAlly(p);
        for (Pokemon p : foes) battle.addFoe(p);
        battle.go();
    }
}
