package dungeonDragon.gameBoard.enemy;

import dungeonDragon.character.AbstractCharacter;

public class Witch extends Enemy {

    public Witch() {
        super("Powerful witch", 6, 3);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("There is a witch, beautiful but with a very strange glint in the eye");
    }
}
