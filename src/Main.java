import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Latios("Латиос", 50));
        battle.addAlly(new Manectric("Манектрик", 50));
        battle.addAlly(new Victreebel("Виктрибел", 50));
        battle.addFoe(new Electrike("Электрайк", 30));
        battle.addFoe(new Weepinbell("Випинбелл", 30));
        battle.addFoe(new Bellsprout("Беллспраут", 20));
        battle.go();
    }
}
