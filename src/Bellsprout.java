import ru.ifmo.se.pokemon.*;

class Bellsprout extends Pokemon {
    Bellsprout(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(50, 75, 35, 70, 30, 40);
        setMove(new SweetScent(), new SludgeBomb());
    }
}
