import ru.ifmo.se.pokemon.*;

final class Latios extends Pokemon {
    Latios(String name, int level) {
        super(name, level);
        setType(Type.DRAGON, Type.PSYCHIC);
        setStats(80, 90, 80, 130, 110, 110);
        setMove(new ChargeBeam(), new IceBeam(), new SteelWing(), new RestMove());
    }
}
