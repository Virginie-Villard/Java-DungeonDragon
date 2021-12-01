package dungeonDragon.gameBoard;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public abstract class Cell {

	// INTERACTIONS ________________________________________________________________________________

	// public abstract void interaction(AbstractCharacter abstractCharacter, Menu menu);

	public abstract void interaction(AbstractCharacter currentCharacter, Menu menu);
}
