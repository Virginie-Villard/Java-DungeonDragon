package dungeonDragon.gameBoard.protection;
public abstract class DefenseItem {
	
	private String defenseItemName;
	private int defenseItemLvl;

	public DefenseItem() {
		this("Unnamed defense item");
	}
	
	public DefenseItem(String name) {
		this(name, 2);
	}
	
	public DefenseItem(String name, int level) {
		this.setName(name);
		this.setLevel(level);
	}
	
	/* Utilisation de la m�thode toString() pour mettre en forme l'objet DefenseItem dans la console
	 * apr�s que l'utilisateur ait choisi les champs string et tir� au sort les champs int.
	 */

	public String toString() {
		return ("\n - Defense item name : " + this.defenseItemName + "\n - Defense item level : " + this.defenseItemLvl);
	}
	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.
	
	public String getDefenseItemName() {
		return defenseItemName;
	}

	protected void setName(String defenseItemName) {
		this.defenseItemName = defenseItemName;
	}

	public int getDefenseItemLvl() {
		return defenseItemLvl;
	}

	protected void setLevel(int defenseItemLvl) {
		this.defenseItemLvl = defenseItemLvl;
	}
}
