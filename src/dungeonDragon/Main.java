package dungeonDragon;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Super jeu");
		
		Game game = new Game();
		game.startGame();
    }
}

// Diagramme UML : https://app.diagrams.net/#G1aq3c8h5TFVy58lBPG7XuhXxJBWmVP12P
// https://www.youtube.com/watch?v=nRqTXoiNUHk
// https://www.youtube.com/watch?v=nRqTXoiNUHk
/* TODO
- Rajouter class :
	- potion (abstract / bonus)
	- LittlePotion (potions)
	- MediumPotion (potions)
	- Hammer (weapon)
	- FireBall (spell)
	- IceSpike (spell)
	- IronShield (shield)
	- ObsidianShield (shield)
	- AstralProtection (filter)
	- EnergyProtection (filter)
et class filles si possible.

- Vérifier les extends du package Bonus
- Modifier l'héritage des cells....
	- attackItem et class filles
	- defenseItem et class filles
- Boucle pour la création du plateau (Cf pour visuel compter en base 8)
- Gérer les exceptions !
- Commencer par faire marcher les 4 cases.

- Gérer la mort / Game Over.

 */

