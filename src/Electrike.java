import ru.ifmo.se.pokemon.*;

class Electrike extends Pokemon {
    Electrike(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(40, 45, 40, 65, 40, 65);
        setMove(new Leer(), new Thunderbolt(), new Spark());
    }
}
