package dungeonDragon.gameBoard.enemy;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public class Dragon extends Enemy {

    public Dragon() {
        super("Cupid dragon", 20, 4);
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
//        System.out.println("Oh no! You've come face to face with a greedy Dragon who thinks you want to steal his treasure!");
//    }
}
