package dungeonDragon;

// import java.util.ArrayList;
// import java.util.Scanner;

// import dugeonDragon.character.Warrior;
// import dugeonDragon.character.Wizard;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Super jeu");
		// Scanner clavier = new Scanner(System.in);
		
		Game game = new Game();
		// Menu menu = new Menu();
		// menu.userChoice(clavier);
		// menu.getWarriorList();
		// menu.getWizardList();
    }
    
    /* private ArrayList<Warrior> warriorList;
    private ArrayList<Wizard> wizardList;
    		
    public boolean charactersReady() {
		boolean isReady = false;
		// switch !
		
		if(warriorList.isEmpty() && wizardList.isEmpty()) {
			System.out.println("You have to create a character to start the game...");
			return isReady;
		}
		else if(!warriorList.isEmpty()) {
			System.out.println("Your warrior is in position 1");
			return isReady = true;
		}
		else if(!wizardList.isEmpty()) {
			System.out.println("Your wizard is in position 1");
			return isReady = true;
		}
		else {
			System.out.println("Critical error you will self-destruct !!!");
			return isReady;
		}
    }
    	
    	
	public void startGame(Scanner clavier, boolean isReady) {
		charactersReady();
				
		if (isReady) {
			System.out.println("isReady = " + isReady);
			int position = 1;
			
			do {
				System.out.print("\nPosition " + position + ", press Enter to launch 1 dice : ");
				clavier.nextLine();
				int diceRoll = Dice.roll(1);
				
				position += diceRoll;
			}
			while (position <= 64);
			
			System.out.print("\nYou win ! ");
			}
		else {
			System.out.print("\nCreate a character to play : ");
			System.out.println("isReady is meant not to be ready : " + isReady);
		}
	} */
}

