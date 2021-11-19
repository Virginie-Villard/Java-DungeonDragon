// Déclaration du Package, nécéssaire.
package dungeonDragon;

import java.util.Scanner;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.character.Warrior;
import dungeonDragon.character.Wizard;

public class Menu {

	private Scanner clavier = new Scanner(System.in);
	
	public Menu() {}
		
	public int userChoice() {

		System.out.print("\n - 1 : Exit \n - 2 : Create a character ");
		int userChoice = clavier.nextInt();

		/*
		 * Prend en compte le saut de ligne du clavier fait avant l'entrée. Merci Rick !
		 */
		clavier.nextLine();
		return userChoice;
	}

	public AbstractCharacter chooseCharacter() {
		System.out.print("\n - 1 : Create a Warrior \n - 2 : Create a Wizard ");
		int userChoice = clavier.nextInt();
		AbstractCharacter newCharacter = null;
		switch (userChoice) {

		case 1:
			System.out.println("\n \t Warrior");
			newCharacter = warrior();
			break;

		case 2:
			System.out.println("\n \t Wizard");
			newCharacter = wizard();
			break;

		default:
			System.out.println("Invalid choice, try again...");
			break;
		}
		return newCharacter;
	}
	
	/* ___WARRIOR__lancers de dé __________________________________________________________________
	 */

	  private AbstractCharacter warrior() {
		  System.out.println("\nChoose your warrior name : "); 
		  String warriorName = clavier.nextLine();
		  
		  System.out.print("\nLife level, press Enter to launch 5 dices : ");
		  clavier.nextLine(); int launchDice1 = Dice.roll(5); 
		  int lifeLvl = launchDice1;
		  
		  System.out.print("\nAttack force, press Enter to launch 1 dice : ");
		  clavier.nextLine(); int launchDice2 = Dice.roll(1); 
		  int attackForce = launchDice2;
		  
		  System.out.println("\nWeapon name ? "); 
		  String weaponName = clavier.nextLine();
		  
		  System.out.print("\nWeapon attack level, press Enter to launch 1 dice : ");
		  clavier.nextLine(); int launchDice3 = Dice.roll(1); 
		  int weaponAttackLvl = launchDice3;
		  
		  System.out.println("\nShield name ? "); 
		  String shieldName = clavier.nextLine();
		  
		  System.out.print("\nShield defense level, press Enter to launch 1 dice : ");
		  clavier.nextLine(); int launchDice4 = Dice.roll(1); 
		  int shieldDefenseLvl = launchDice4;
		  
		  return new Warrior(warriorName, lifeLvl, attackForce, weaponName,
		  weaponAttackLvl, shieldName, shieldDefenseLvl);
	  }
	 

	/*
	 * ___WIZZARD__lancers de
	 * d�____________________________________________________________________
	 */

	private AbstractCharacter wizard() {
		System.out.print("\nChoose your wizard name : ");
		String name = clavier.nextLine();

		System.out.print("\nLife level, press Enter to launch 5 dices : ");
		clavier.nextLine();
		int life = Dice.roll(5);

		System.out.print("\nAttack force, press Enter to launch 1 dice : ");
		clavier.nextLine();
		int force = Dice.roll(1);

		System.out.println("\nSpell name ? ");
		String spellName = clavier.nextLine();

		System.out.print("\nSpell attack level, press Enter to launch 1 dice : ");
		clavier.nextLine();
		int spellLvl = Dice.roll(1);

		System.out.println("\nFilter ? ");
		String filterName = clavier.nextLine();

		System.out.print("\nFilter level, press Enter to launch 1 dice : ");
		clavier.nextLine();
		int filterLvl = Dice.roll(1);

		return new Wizard(name, life, force, spellName, spellLvl, filterName, filterLvl);
	}
	
	public void exitGame() {
		System.out.println("\n \t \t___________\n \t \t  Game Over\n \t \t___________");
	}
}
