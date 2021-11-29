package dungeonDragon.gameBoard.bonus.potions;

import dungeonDragon.character.AbstractCharacter;

public class MediumPotion extends HealingPotion {

    public MediumPotion() {
        super("Medium healing potion", 5);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("Wow ! Bursting the darkness, a medium potion of health give you 5 point of life!" +
                "\nYour life increases by 5, now you're : ");

        abstractCharacter.usePotion(this);
        System.out.println(abstractCharacter.getLife());
    }
}
