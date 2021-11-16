package dugeonDragon.protection;
public abstract class DefenseItem {
	
	private String protectionName;
	private int protectionLvl;

	public DefenseItem() {
		this("Undefined protection");
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
		return ("\nHis protection name is : " + this.protectionName + "\nHis protection level is : " + this.protectionLvl);
	}
	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.
	
	public String getProtectionName() {
		return protectionName;
	}

	protected void setName(String protectionName) {
		this.protectionName = protectionName;
	}

	public int getProtectionLvl() {
		return protectionLvl;
	}

	protected void setLevel(int protectionLvl) {
		this.protectionLvl = protectionLvl;
	}
}
