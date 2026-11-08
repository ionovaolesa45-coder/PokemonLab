import ru.ifmo.se.pokemon.*;

final class Manectric extends Electrike {
    Manectric(String name, int level) {
        super(name, level);
        setStats(70, 75, 60, 105, 60, 105);
        addMove(new Overheat());
    }
}
