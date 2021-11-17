// D�claration du Package, n�c�ssaire.
package dugeonDragon;

// On rend disponible toutes les classes du package java.util (Scanner etc)
import dugeonDragon.character.Warrior;
import dugeonDragon.character.Wizard;

import java.util.*;
/*
import dungeonDragon.character.Warrior;
import dungeonDragon.character.Wizzard;*/

public class TestGame {

	// Déclaration des attributs de la classe TestGame (équivalente au menu). */
	private Warrior warrior;
	private Wizard wizard;

	private ArrayList<Warrior> warriorList;
	private ArrayList<Wizard> wizardList;

	/* D�claration des constructeurs. 
	 * Le premier, sans param�tre,
	 * le deuxi�me avec le nom comme param�tre, sera utilis� par le premier.
	 * le troisi�me et le quatri�me ont tous les param�.tres 
	 * mais l'un avec un objet et l'autre avec les attributs de l'objet.
	 *  */
	public TestGame() {
		warriorList = new ArrayList();
		wizardList = new ArrayList();

	}
	
	/*public static void main(String[] args) {

	} */
	
	public void userChoice(Scanner clavier) {
		System.out.println("Dungeons and Dragons");
		
		
		/* Instance du Scanner, pour r�cup�rer les entr�es clavier de l'utilisateur
		(Nom des personnages, des armes, des sorts et boucliers). */
		
		/* D�claration d'un booléen isPlaying pour pouvoir arrêter le jeu. */
		boolean isPlaying = true;
		
		do {
			System.out.print("\nIf you want to stop game choose 0, if you want a warrior choose 1, if you want a wizzard choose 2, \nif you want to see your characters choose 3, if you want to start the game choose 4 : ");
			int userChoice = clavier.nextInt();
			
			/* Prend en compte le saut de ligne du clavier fait avant l'entrée. Merci Rick ! */
			clavier.nextLine();
			
			/* Switch pour le choix d'utilisateur
			 * 0 - Quitter le jeu.
			 * 1 - Cr�er un Guerrier
			 * 2 - Cr�er un sorcier
			 * 3 - Cr�er deux arrayList avec les diff�rents guerriers ou sorciers cr��s.
			 * 4 - Jouer au jeu (une fois un personnage cr��). 
			 * 
			 * Pour les niveaux (int), on utilise les lancers de d� (classe Dice);
			 * pour les strings on utilise les entr�es clavier, choix utilisateur.
			 * C'est possible de faire aussi les entiers en choix utilisateurs (pr�c�dents commits) 
			 * mais pour un JDR j'ai trouv� plus coh�rent de laisser le choix des niveaux au hasard des lancers de d�. */
			switch (userChoice) {
				case 0:
					isPlaying = false;
					System.out.println("You have left the game. Reload to play again.");
					break;
		
				case 1:
					System.out.println("\n \t Warrior");
					warrior(clavier);
					break;
		
				case 2:
					System.out.println("\n \t Wizard");
					wizzard(clavier);
					break;
					
				case 3:
					System.out.println("\n \t Warrior list");
					System.out.println(warriorList);
					System.out.println("\n \t Wizards list");
					System.out.println(wizardList);
					break;
					
				case 4:
					this.startGame(clavier, isPlaying);
					break;

				default:
					System.out.println("Invalid choice, try again...");
					break;
			}
		}
		while(isPlaying);
	}

	/* ___WARRIOR__lancers de d�__________________________________________________________________
	 * Pour les niveaux (int), on utilise les lancers de d� (classe Dice);
	 * pour les strings on utilise les entr�es clavier, choix utilisateur.
	 * C'est possible de faire aussi les entiers en choix utilisateurs (pr�c�dents commits) 
	 * mais pour un JDR j'ai trouv� plus coh�rent de laisser le choix des niveaux au hasard des lancers de d�.
	 */

	 private void warrior(Scanner clavier) {
		System.out.println("\nChoose your warrior name : ");
		String warriorName = clavier.nextLine();
		
		System.out.print("\nLife level, press Enter to launch 5 dices : ");
		clavier.nextLine();
		int launchDice1 = Dice.roll(5);
        int lifeLvl = launchDice1;
        
        System.out.print("\nAttack force, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice2 = Dice.roll(1);
        int attackForce = launchDice2;
        
        System.out.println("\nWeapon name ? ");
        String weaponName = clavier.nextLine();
        
        System.out.print("\nWeapon attack level, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice3 = Dice.roll(1);
        int weaponAttackLvl = launchDice3;
        
        System.out.println("\nShield name ? ");
        String shieldName = clavier.nextLine();
        
        System.out.print("\nShield defense level, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice4 = Dice.roll(1);
        int shieldDefenseLvl = launchDice4;
        
        warrior = new Warrior(warriorName, lifeLvl, attackForce, weaponName, weaponAttackLvl, shieldName, shieldDefenseLvl);
        
        this.warriorList.add(warrior);
        
        System.out.println("Here is your warrior :\n");
        System.out.println("\n" + warrior);
	}
	
	/* ___WIZZARD__lancers de d�____________________________________________________________________ */

	private void wizzard(Scanner clavier) {
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

        wizard = new Wizard(name, life, force, spellName, spellLvl, filterName, filterLvl);
        
        this.wizardList.add(wizard);
        
        System.out.println("\nHere is your wizard :\n");
        System.out.println(wizard);
	}
	
	/* ___Functions__charactersReady__playGame_____________________________________________________ */

	public boolean charactersReady() {
		boolean isReady = false;
		// switch !
		
		if(warriorList.isEmpty() && wizardList.isEmpty()) {
			System.out.println("You have to create a character to start the game...");
			return isReady;
		}
		else if(!warriorList.isEmpty()) {
			System.out.println("Your warrior is in position 1");
			return isReady = !isReady;
		}
		else if(!wizardList.isEmpty()) {
			System.out.println("Your wizard is in position 1");
			return isReady = !isReady;
		}
		else {
			System.out.println("Critical error you will self-destruct !!!");
			return isReady;
		}
	}

	
	private void startGame(Scanner clavier, boolean isReady) {
		
		if (isReady == false) {
			System.out.println("isReady is ready !" + isReady);
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
			System.out.println("isReady is meant not to be ready !" + isReady);
		}
	}
}

