import ru.ifmo.se.pokemon.*;

final class Leer extends StatusMove {
    Leer() { super(Type.NORMAL, 0, 100); }
    @Override protected void applyOppEffects(Pokemon p) { p.setMod(Stat.DEFENSE, -1); }
    @Override protected String describe() { return "использует Leer и снижает защиту противника"; }
}
