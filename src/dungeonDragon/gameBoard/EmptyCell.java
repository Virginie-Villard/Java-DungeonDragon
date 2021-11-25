package dungeonDragon.gameBoard;

import dungeonDragon.character.AbstractCharacter;

public class EmptyCell  extends Cell {

    public EmptyCell() {}

    @Override
    public void interaction(AbstractCharacter abstractCharacter) {
        System.out.println("There is nothing here except a windy landscape.");
    }
}
