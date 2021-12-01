package dungeonDragon.gameBoard;

import dungeonDragon.Menu;
import dungeonDragon.character.AbstractCharacter;

public interface Cell {

	// INTERACTIONS ________________________________________________________________________________

	// public abstract void interaction(AbstractCharacter abstractCharacter, Menu menu);

	void interaction(AbstractCharacter currentCharacter, Menu menu);
}
