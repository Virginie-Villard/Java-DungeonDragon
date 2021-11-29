package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.character.AbstractCharacter;

public class MediumPotion extends HealingPotion {

    public MediumPotion() {
        super("Medium healing potion", 4);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("Wow ! Bursting the darkness, a medium potion of health give you 4 point of life!" +
                "\nYour life increases by 4, now you're : ");

        abstractCharacter.usePotion(this);
        System.out.println(abstractCharacter.getLife());
    }
}
