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
	- LittlePotion (potions) (à mettre par défaut dans classe potion)
	- MediumPotion (potions) (rajouter des effets dans la potion)
	- Hammer (weapon) Axe (ajouter une attaque lourde par ex)
	- FireBlast (spell) (voir pour spécificité)
	- IceSpike (spell) (ajout de frozen (enlève 1 pt au dé puisque bloqué)
	- IronShield (shield) (le mettre par défaut dans la classe bouclier)
	- ObsidianShield (shield) (rajouter une différence d'absorbtion des dégâts)
	- AstralProtection (filter) (rajouter une différence d'absorbtion des dégâts)
	- EnergyProtection (filter) (le mettre par défaut dans la classe filtre)
(et class filles si possible).

- Vérifier les extends du package Bonus
- remove press enter pour les stats
- tirage au sort l'attribution des cases
(lui donner des stats différentes en fonction de l'endroit sur le plateau)
exemple case 1, a plus de chance d'obtenir une récompense ou un ennemi faible
que case 63 où il y aura plus de risque de tomber sur un dragon.
- case 62 fait revenir à la case 20 par exemple ^^.
- Boucle pour la création du plateau (Cf pour visuel compter en base 8)
- Gérer les exceptions !
- Commencer par faire marcher les 4 cases.

- Gérer la mort / Game Over.

 */

