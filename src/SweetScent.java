import ru.ifmo.se.pokemon.*;

final class SweetScent extends StatusMove {
    SweetScent() { super(Type.NORMAL, 0, 100); }
    @Override protected void applyOppEffects(Pokemon p) { p.setMod(Stat.EVASION, -1); }
    @Override protected String describe() { return "использует Sweet Scent и снижает уклонение противника"; }
}
