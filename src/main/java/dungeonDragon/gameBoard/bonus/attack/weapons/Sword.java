package dungeonDragon.gameBoard.bonus.attack.weapons;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Warrior;

public class Sword extends Weapon {

    public Sword() {
        super("Sword", 3);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
        System.out.println("When you arrive, you quickly check the Cell and find a sword under the dirt.");
        if (abstractCharacter instanceof Warrior) {
            ((Warrior) abstractCharacter).setWeapon(this);
            System.out.println("This could be useful...");
        }
        else {
            System.out.println("But you're not a Warrior, you're a Wizard and You would never use this hardware!");
        }
    }
}
