import ru.ifmo.se.pokemon.*;

final class Overheat extends SpecialMove {
    Overheat() { super(Type.FIRE, 130, 90); }
    @Override protected void applySelfEffects(Pokemon p) { p.setMod(Stat.SPECIAL_ATTACK, -2); }
    @Override protected String describe() { return "использует Overheat и снижает свою спец. атаку"; }
}
