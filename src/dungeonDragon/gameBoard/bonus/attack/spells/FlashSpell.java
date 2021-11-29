package dungeonDragon.gameBoard.bonus.attack.spells;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Warrior;
import dungeonDragon.character.Wizard;

public class FlashSpell extends Spell {

    public FlashSpell () {
        super("Flash spell", 2);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("You find a spell oh flash...");

        if (abstractCharacter instanceof Wizard) {
            ((Wizard) abstractCharacter).setSpell(this);
            System.out.println("great! ");
        }
        else {
            System.out.println("But you're a Warrior and it's all Greek to you.");
        }
    }
}
