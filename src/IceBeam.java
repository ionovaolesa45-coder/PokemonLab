import ru.ifmo.se.pokemon.*;

final class IceBeam extends SpecialMove {
    IceBeam() { super(Type.ICE, 90, 100); }
    @Override protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.1).success()) Effect.freeze(p);
    }
    @Override protected String describe() { return "использует Ice Beam"; }
}
