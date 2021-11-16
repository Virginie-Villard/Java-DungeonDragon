package dugeonDragon.character;

import dugeonDragon.attack.Spell;
import dugeonDragon.protection.Filter;

public class Wizard extends Character {

	protected String defaultName = "Sabrina";

	public Wizard() {
        this("");
    }

    public Wizard(String name) {
		super(name, 9, 10, null, null);
    }
	
	public Wizard(String name, int life,
				  int force, Spell spell,
				  Filter filter) {
		super(name, life, force, spell, filter);
	}
	
	public Wizard(String name, int life,
				  int force, String spellName, int spellLvL,
				  String filterName, int filterLvl) {
		super(name, life, force,
				new Spell(spellName, spellLvL),
				new Filter(filterName, filterLvl));
	}
	
	/* Utilisation de la méthode toString() pour mettre en forme l'objet Wizzard dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
/*	public String toString() {
		return ("-- " + name + " --" +
				"\nHis Life level is : " + this.life +
				"\nHis attack force is : " + this.force +
				"\nSpell : " + this.getSpell() +
				"\nHis filter is : " + this.getFilter());
	}*/
	
	// GETTERS et SETTERS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.

	private Spell getSpell() {
		// type casting to Spell
		// @see: https://www.w3schools.com/java/java_type_casting.asp
		return (Spell) this.attackItem;
	}

	private void setSpell(Spell spell) {
		// A Spell is an AttackItem so it's ok
		this.attackItem = spell;
	}

	private Filter getFilter() {
		// On vérifie que le defenceItem est bien de type Filter. Je le retourne en le castant.
		// Sinon je retourne null.
		// Pour ne pas permettre à un Wizard de prendre un Shield.
		// @see https://www.javatpoint.com/downcasting-with-instanceof-operator
		if (this.defenseItem instanceof Filter) {
			return (Filter) this.defenseItem;
		}
		return null;
	}

	private void setFilter(Filter filter) {

		if(filter == null) {
			this.defenseItem = new Filter("Pure energy shield", 1);
		}
		else {
			this.defenseItem = filter;
		}

		System.out.println("Set filter name: " + this.defenseItem);
	}
}
