package dungeonDragon.gameBoard.enemy;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public class Goblin extends Enemy {

    public Goblin() {
        super("Hideous Goblin", 4, 2);
    }

//    @Override
//    public void interaction(AbstractCharacter abstractCharacter, Menu menu) {
//        System.out.println("A goblin stares at you with its nasty little eyes... " +
//                		"\nYou should fight him to go further");
//
//        this.receiveDamage(abstractCharacter);
//    }
}

