package dungeonDragon.gameBoard.enemy;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public class Witch extends Enemy {

    public Witch() {
        super("Powerful witch", 15, 3);
    }

    public String toString() {
        return super.toString();
    }

//    public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
//        System.out.println("There is a witch, beautiful but with a very strange glint in the eye");
//    }
}
