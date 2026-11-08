import ru.ifmo.se.pokemon.*;

final class SteelWing extends PhysicalMove {
    SteelWing() { super(Type.STEEL, 70, 90); }
    @Override protected void applySelfEffects(Pokemon p) {
        if (new Effect().chance(0.1).success()) p.setMod(Stat.DEFENSE, 1);
    }
    @Override protected String describe() { return "использует Steel Wing"; }
}
