package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.character.AbstractCharacter;

public class LittlePotion extends Potion {

    public LittlePotion() {
        super("Little healing potion", 2);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("Wow ! Bursting the darkness, a small potion of health give you 2 point of life !");
    }
}
