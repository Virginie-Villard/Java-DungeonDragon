package dungeonDragon.gameBoard.attack;

public abstract class AttackItem {
	
	private String name;
	private int attackLvl;

	public AttackItem() {
		this("Unnamed attackObject");
	}
	
	public AttackItem(String name) {
		this(name, 2);
	}
	
	public AttackItem(String name, int attackLvl) {
		this.setName(name);
		this.setAttackLvl(attackLvl);
	}
	
	/* Utilisation de la m�thode toString() pour mettre en forme l'objet Weapon dans la console
	 * apr�s que l'utilisateur ait choisi les champs string et tir� au sort les champs int.
	*/
	public String toString() {
		return ("\n - Attack item name : " + this.name + "\n - Attack item level is : " + this.attackLvl);
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
