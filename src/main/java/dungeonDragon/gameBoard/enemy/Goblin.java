package dungeonDragon.gameBoard.enemy;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public class Goblin extends Enemy {

    private String descrition = "A goblin stares at you with its nasty little eyes... " +
            "                \nYou should fight him to go further";

    public Goblin() {
        super("Hideous Goblin", 10, 2);
       // this.getDescription;
    }

    public void displayGoblin() {
        System.out.println("A goblin stares at you with its nasty little eyes... " +
                		"\nYou should fight him to go further");
    }

    public String getDescrition() {
        return descrition;
    }
}

