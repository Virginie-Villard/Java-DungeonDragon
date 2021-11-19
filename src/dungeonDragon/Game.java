package dungeonDragon;

import java.util.ArrayList;
import dungeonDragon.character.AbstractCharacter;

// import java.util.Scanner;

public class Game {
	
	public Game() {}
	
	Menu menu = new Menu();
	
	public void startGame() {
		int choice = menu.userChoice();
		boolean exit = false;
		
		do {
			if(choice == 1) {
			menu.exitGame();
			exit = true;
			}
			if(choice == 2) {
				chooseCharacter();
			}
		}
		while (exit == false);
			
	}
	public void chooseCharacter() {
		AbstractCharacter character = menu.chooseCharacter();
	}
}
