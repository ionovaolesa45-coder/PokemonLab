import ru.ifmo.se.pokemon.*;

class Weepinbell extends Bellsprout {
    Weepinbell(String name, int level) {
        super(name, level);
        setStats(65, 90, 50, 85, 45, 55);
        addMove(new PoisonPowder());
    }
}
