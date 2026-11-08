import ru.ifmo.se.pokemon.*;

final class RestMove extends StatusMove {
    RestMove() { super(Type.PSYCHIC, 0, 100); }
    @Override protected void applySelfEffects(Pokemon p) { p.restore(); Effect.sleep(p); }
    @Override protected String describe() { return "использует Rest и восстанавливает здоровье"; }
}
