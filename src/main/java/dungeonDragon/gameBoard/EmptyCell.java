package dungeonDragon.gameBoard;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public class EmptyCell  implements Cell {

    public EmptyCell() {}

    //public void interaction(AbstractCharacter abstractCharacter) {
        //System.out.println("There is nothing here except a windy landscape.");
    //}

    @Override
    public void interaction(AbstractCharacter currentCharacter, Menu menu) {
        System.out.println("There is nothing here except a windy landscape.");
    }
}
