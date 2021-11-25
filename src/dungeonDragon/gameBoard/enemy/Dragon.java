package dungeonDragon.gameBoard.enemy;

import dungeonDragon.character.AbstractCharacter;

public class Dragon extends Enemy {

    public Dragon() {
        super("Cupid dragon", 8, 4);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("Oh no! You've come face to face with a greedy Dragon who thinks you want to steal his treasure!");
    }
}
