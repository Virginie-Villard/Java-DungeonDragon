package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public class LittlePotion extends HealingPotion {

    public LittlePotion() {
        super("Little healing potion", 2);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
        System.out.println("Wow ! Bursting the darkness, a small potion of health give you 2 point of life!" +
                "\nYour life increases by 2, now you're : ");

        abstractCharacter.usePotion(this);
        System.out.println(abstractCharacter.getLife());
    }
}
