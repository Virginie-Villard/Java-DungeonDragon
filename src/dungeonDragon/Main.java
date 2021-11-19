package dungeonDragon;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Super jeu");
		
		Game game = new Game();
		game.startGame();
    }
}


/* TODO
- Rajouter class :
	- potion (abstract / bonus)
	- LittlePotion (potions)
	- MediumPotion (potions)
	- Witch (enemy)
	- Dragon (enemy)
	- Hammer (weapon)
	- FireBall (spell)
	- IceSpike (spell)
	- IronShield (shield)
	- ObsidianShield (shield)
	- AstralProtection (filter)
	- EnergyProtection (filter)
et class filles si possible.

- Ne pas oublier Dice dans UML
- Boucle pour la création du plateau (Cf pour visuel compter en base 8)
- Gérer les exceptions !
- Commencer par faire marcher les 4 cases.

 */

