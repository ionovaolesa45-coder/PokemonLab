import ru.ifmo.se.pokemon.*;

final class Thunderbolt extends SpecialMove {
    Thunderbolt() { super(Type.ELECTRIC, 90, 100); }
    @Override protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.1).success()) Effect.paralyze(p);
    }
    @Override protected String describe() { return "использует Thunderbolt"; }
}
