package dungeonDragon.gameBoard.bonus.attack.spells;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Wizard;

public class FireBlast extends Spell {

    public FireBlast () {
        super("Fire blast", 4);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("You find a Fire blast spell...");

        if (abstractCharacter instanceof Wizard) {
            ((Wizard) abstractCharacter).setSpell(this);
            System.out.println("Good news! you would be able to use it.");
        }
        else {
            System.out.println("But you're a Warrior and swords are your thing instead.");
        }
    }
}
