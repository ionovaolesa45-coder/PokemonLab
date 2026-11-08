import ru.ifmo.se.pokemon.*;

final class PoisonPowder extends StatusMove {
    PoisonPowder() { super(Type.POISON, 0, 75); }
    @Override protected void applyOppEffects(Pokemon p) { Effect.poison(p); }
    @Override protected String describe() { return "использует Poison Powder и отравляет противника"; }
}
