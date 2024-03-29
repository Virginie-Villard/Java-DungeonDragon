package dungeonDragon.gameBoard.enemy;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.Menu;

public class Fight {

    public Fight(Menu menu, AbstractCharacter abstractCharacter, Enemy enemy) {

        // private String enemyDescription = enemy.getDescription();
        int newLifeEnemy = enemy.getLife();
        int newLifeCharacter = abstractCharacter.getLife();

        System.out.println("\t -- FIGHT --");

        // Choix de fuire :
        int escapeC = menu.escapeChoice();
        if (escapeC == 2) {
            //RIEN
            int rien = 0;
        } else {

            do {
                // L'ennemi se prend un coup :
                newLifeEnemy = characterAttacks(abstractCharacter, enemy);
                System.out.println("Vous avez infligé à " + enemy.name + ", " + abstractCharacter.getDamage() + " points de dégats, il lui reste : " + enemy.getLife());

                // Vérif si la vie de l'ennemi >0;
                if (newLifeEnemy > 0) {
                    newLifeCharacter = enemyAttacks(abstractCharacter, enemy);

                    System.out.println(enemy.name + " vous a infligé " + enemy.getForce() + " points de dégats, il vous reste : " + abstractCharacter.getLife());
                }

                if (newLifeCharacter <= 0) {
                    System.out.println("\n \t \t___________\n \t \t  Game Over\n \t \t___________");
                } else if (newLifeEnemy <= 0) {
                    System.out.println("Enemy dies.");
                }
            }
            while (newLifeEnemy > 0 && newLifeCharacter > 0);
        }
    }

    public int enemyAttacks(AbstractCharacter perso, Enemy enemy) {
        int newLifeCharacter = perso.getLife() - enemy.getForce();
        perso.setLife(newLifeCharacter);
        return newLifeCharacter;
    }

    public int characterAttacks(AbstractCharacter abstractCharacter, Enemy enemy) {
        int newLifeEnemy = enemy.getLife() - abstractCharacter.getDamage();
        enemy.setLife(newLifeEnemy);
        return newLifeEnemy;
    }
}



