import ru.ifmo.se.pokemon.*;

final class LeafTornado extends SpecialMove {
    LeafTornado() { super(Type.GRASS, 65, 90); }
    @Override protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.5).success()) p.setMod(Stat.ACCURACY, -1);
    }
    @Override protected String describe() { return "использует Leaf Tornado"; }
}
