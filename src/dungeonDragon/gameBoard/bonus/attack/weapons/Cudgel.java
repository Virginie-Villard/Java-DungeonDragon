package dungeonDragon.gameBoard.bonus.attack.weapons;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Warrior;

public class Cudgel  extends Weapon {

    public Cudgel() {
        super("Cudgel", 4);
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("There was a corpse in the room holding a cudgel... ");
        if (abstractCharacter instanceof Warrior) {
            ((Warrior) abstractCharacter).setWeapon(this);
            System.out.println("you look right and left and finally you keep it to yourself, you never know!");
        }
        else {
            System.out.println("but you're a Wizard and this junk will completely useless to you");
        }
    }
}
