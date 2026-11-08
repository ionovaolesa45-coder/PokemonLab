import ru.ifmo.se.pokemon.*;

final class Spark extends PhysicalMove {
    Spark() { super(Type.ELECTRIC, 65, 100); }
    @Override protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.3).success()) Effect.paralyze(p);
    }
    @Override protected String describe() { return "использует Spark"; }
}
