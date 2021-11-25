package dungeonDragon;

import java.util.ArrayList;
import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.exceptions.OutOfBoard;
import dungeonDragon.gameBoard.GameBoard;

public class Game {
	
	private ArrayList<AbstractCharacter> characterList = new ArrayList<AbstractCharacter>();
	Menu menu = new Menu();
	GameBoard gameBoard = new GameBoard();
	
	public Game() {}
	
	public void startGame() {
		boolean exit = false;
		
		do {
			int choice = menu.userChoice();
			if(choice == 1) {
			menu.exitGame();
			exit = true;
			}
			else if(choice == 2) {
				chooseCharacter();
			}
			else if(choice == 3) {
				menu.displayList(characterList);
			}
			else if(choice == 4) {
				try {
					playGame();
				} catch (OutOfBoard e) {
					System.out.println("You Win !");
				}

			}
		}
		while (!exit);
	}
	
	public void chooseCharacter() {
		AbstractCharacter character = menu.chooseCharacter();
		characterList.add(character);
	}
	
	public boolean charactersReady() {
		boolean isReady = false;

		if(characterList.isEmpty()) {
			System.out.println("You have to create a character to start the game...");
			isReady = false;
			// return false;
		}
		else if(!characterList.isEmpty()) {
			System.out.println("Your character is in position 1");
			isReady = true;
			//return true;
		}
		else {
			System.out.println("Critical error you will self-destruct !!!");
			isReady = false;
			//return false;
		}

		return isReady;
    }

	/**
	 * Better isReady function
	 * @return
	 */
	private boolean hasCharacter()
	{
		return !characterList.isEmpty();
	}
	
	public void playGame() throws OutOfBoard { // (boolean isReady) (Paramètre)
		int position = 0;
//		charactersReady();

		if(charactersReady()) {
//			System.out.println("isReady = " + isReady);

			do {
				System.out.print("\nPosition " + position + ", press Enter to launch 1 dice : ");
//				menu.getClavier().nextLine();
//				int diceRoll = Dice.roll(1);
//
//				position += diceRoll;
				position += 1;
				gameBoard.getCell(position);
			}
			while (position <= 3); // TODO repasser à 64 !

			System.out.print("\nYou win ! ");
		}
//		else {
//			System.out.print("\nCreate a character to play : ");
//			System.out.println("isReady is meant not to be ready : " + isReady);
//		}
	}

}



