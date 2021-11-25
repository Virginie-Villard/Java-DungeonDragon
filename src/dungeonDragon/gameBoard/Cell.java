package dungeonDragon.gameBoard;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.gameBoard.enemy.Goblin;

public abstract class Cell {

	// INTERACTIONS ________________________________________________________________________________

	public abstract void interaction(AbstractCharacter abstractCharacter);
}
