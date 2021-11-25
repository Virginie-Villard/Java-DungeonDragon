package dungeonDragon.gameBoard.bonus.attack;

import dungeonDragon.gameBoard.Cell;

public abstract class AttackItem extends Cell {
	
	private String name;
	private int attackLvl;

	public AttackItem(String name, int attackLvl) {
		this.name = name;
		this.attackLvl = attackLvl;
	}

	/* Utilisation de la méthode toString() pour mettre en forme l'objet Weapon dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	*/
	public String toString() {
		return ("\n||\t - Attack item name : " + this.name + "\n||\t - Attack item level is : " + this.attackLvl);
	}

	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAttackLvl() {
		return attackLvl;
	}

	protected void setAttackLvl(int attackLvl) {
		this.attackLvl = attackLvl;
	}
}
