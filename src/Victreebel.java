import ru.ifmo.se.pokemon.*;

final class Victreebel extends Weepinbell {
    Victreebel(String name, int level) {
        super(name, level);
        setStats(80, 105, 65, 100, 70, 70);
        addMove(new LeafTornado());
    }
}
