import ru.ifmo.se.pokemon.*;

final class SludgeBomb extends SpecialMove {
    SludgeBomb() { super(Type.POISON, 90, 100); }
    @Override protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.3).success()) Effect.poison(p);
    }
    @Override protected String describe() { return "использует Sludge Bomb"; }
}
