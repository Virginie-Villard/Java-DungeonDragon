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
	- MediumPotion (potions) (rajouter des effets dans la potion)
	- Hammer (weapon) Axe (ajouter une attaque lourde par ex) Massue / Lance
	- FireBlast (spell) (voir pour spécificité)
	- IceSpike (spell) (ajout de frozen (enlève 1 pt au dé puisque bloqué)
	- IronShield (shield) (le mettre par défaut dans la classe bouclier)
	- ObsidianShield (shield) (rajouter une différence d'absorbtion des dégâts)
	- AstralProtection (filter) (rajouter une différence d'absorbtion des dégâts)
	- EnergyProtection (filter) (le mettre par défaut dans la classe filtre)
(et class filles si possible).

- Finir plateau ! (64 cases)
- Gérer les erreurs dans le Game
	- afficher la liste sans perso -> message d'erreur
- remove press enter pour les stats perso !
- tirage au sort l'attribution des cases
(lui donner des stats différentes en fonction de l'endroit sur le plateau)
exemple case 1, a plus de chance d'obtenir une récompense ou un ennemi faible
que case 63 où il y aura plus de risque de tomber sur un dragon.
- Gestion combats
	- lancers de dé (coups critiques / coups normaux / coups ratés) ?
	- Perte des points de vie
	- quand ennemi.vie =< 0, continuer jeu
	- fuite ?
	- Gérer la mort / Game Over.

-- Améliorations :
- case 62 fait revenir à la case 20 par exemple ^^
- Boucle pour la création du plateau (Cf pour visuel compter en base 8)
- Gestion des combats :
	- lancer de dé pour effet de surprise (6 et 5 -> Ennemi surpris donc je commence
		4 et 3 -> tirage au sort pour décider qui commence
		2 et 1 -> Je me suis pris les pieds dans le tapis j'ai fait du bruit, tout le monde m'a entendu arriver ou est  sur le pieds de guerre. Il a l'avantage.
- Possibilité de sauver un 2ème perso qui nous aide
- Possibilité d'être attaqué par plusieurs ennemis sur une seule case
- Possibilité de trouver un trésor en plus à la fin d'un ennemi difficile

 */

