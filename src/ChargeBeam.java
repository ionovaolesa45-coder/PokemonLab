import ru.ifmo.se.pokemon.*;

final class ChargeBeam extends SpecialMove {
    ChargeBeam() { super(Type.ELECTRIC, 50, 90); }
    @Override protected void applySelfEffects(Pokemon p) {
        if (new Effect().chance(0.7).success()) p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
    @Override protected String describe() { return "использует Charge Beam"; }
}
