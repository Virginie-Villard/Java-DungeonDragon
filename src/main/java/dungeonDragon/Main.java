package dungeonDragon;

import main.java.dungeonDragon.character.DAO.WarriorDAO;

import java.util.List;

/**
 * <b>La classe Main démarre le jeu.</b>
 *
 * Elle met en place aussi la base de données.
 * @see WarriorDAO
 */
public class Main {

    public static void main(String[] args) {
    	System.out.println("Super jeu");

		WarriorDAO warriorDAO = new WarriorDAO();

		List warriorListDAO = warriorDAO.getAll();
		System.out.println(warriorListDAO);
		
		Game game = new Game();
		game.startGame();
    }
}

// Diagramme UML : https://app.diagrams.net/#G1aq3c8h5TFVy58lBPG7XuhXxJBWmVP12P
// https://www.youtube.com/watch?v=nRqTXoiNUHk
// https://www.youtube.com/watch?v=nRqTXoiNUHk
/* TODO
- Rajouter class :
	- Hammer (weapon) Axe (ajouter une attaque lourde par ex) Massue / Lance
	- IceSpike (spell) (ajout de frozen (enlève 1 pt au dé puisque bloqué)
	- IronShield (shield) (le mettre par défaut dans la classe bouclier)
	- ObsidianShield (shield) (rajouter une différence d'absorbtion des dégâts)
	- AstralProtection (filter) (rajouter une différence d'absorbtion des dégâts)
	- EnergyProtection (filter) (le mettre par défaut dans la classe filtre)

	- CellsFactory pour améliorer le code de la class GameBoard
(avec entrée Dragon ou autre_ cells.set(index, factory)
(et class filles si possible).
Améliorer le plateau !
tirage au sort l'attribution des cases
(lui donner des stats différentes en fonction de l'endroit sur le plateau)
-- Important "to - do"-----------------
- Rectifier et vérifier les interactions (enlever le français !!!)
- Gérer les erreurs dans le Game
	- afficher la liste sans perso -> message d'erreur
- Gestion combats
	- lancers de dé (coups critiques / coups normaux / coups ratés) ?
	- fuite ?
- pouvoir gérer différentes "classes" d'ennemis (effets différents / protections différentes en fonction du perso...)

-- Améliorations : --------------------
- Pouvoir jouer à plusieurs joueurs avec des tours.
- Pouvoir aller plus loin que 64 cases et ajuster le high score en fonction de la case où le joueur finit le jeu.
- case 62 fait revenir à la case 20 par exemple ^^
- Boucle pour la création visuelle du plateau (Cf pour visuel compter en base 8)
- Gestion des combats :
	- lancer de dé pour effet de surprise (6 et 5 -> Ennemi surpris donc je commence
		4 et 3 -> tirage au sort pour décider qui commence
		2 et 1 -> Je me suis pris les pieds dans le tapis j'ai fait du bruit, tout le monde m'a entendu arriver ou est  sur le pieds de guerre. Il a l'avantage.
- Possibilité de sauver un 2ème perso qui nous aide (ou +).
- Possibilité d'être attaqué par plusieurs ennemis sur une seule case
- Possibilité de trouver un trésor en plus à la fin d'un ennemi difficile
- Pouvoir tirer au sort son perso

 */

