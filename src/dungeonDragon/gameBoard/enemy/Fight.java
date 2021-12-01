package dungeonDragon.gameBoard.enemy;

import dungeonDragon.character.AbstractCharacter;
import dungeonDragon.Menu;

public class Fight {

    public Fight(Menu menu, AbstractCharacter abstractCharacter, Enemy enemy) {

        int newLifeEnemy = enemy.getLife();
        int newLifeCharacter = abstractCharacter.getLife();

        System.out.println("\t -- FIGHT --");

        do {
            // Choix de fuire :

            // L'ennemi se prend un coup :
            newLifeEnemy = characterAttacks(abstractCharacter, enemy);

            // Vérif si la vie de l'ennemi >0;
            if (newLifeEnemy > 0) {
                newLifeCharacter = enemyAttacks(abstractCharacter, enemy);
            }
        }
        while(newLifeEnemy > 0 || newLifeCharacter > 0);

        if(newLifeCharacter <= 0) {
            System.out.println("\n \t \t___________\n \t \t  Game Over\n \t \t___________");
        }
        else if(newLifeEnemy <= 0 ) {
            System.out.println("Enemy dies.");
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

    // FUITE __________________________________________________________________________


//        if (currentCell instanceof Enemy) {
//            menu.escapeChoice();
//        }

//    public void escapeFromFight(int position) {
//        int choice = Menu.escapeChoice();
//        if(choice == 1) {
//            int characterPosition = escape(position);
//        }
//    }
//
//    public int escape(int position) {
//        System.out.print("Life level, 1 dice : ");
//        position -= Dice.roll(1);
//        return position;
//    }


}



