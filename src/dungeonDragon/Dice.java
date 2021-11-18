package dungeonDragon;

/*
 * @see : https://www.geeksforgeeks.org/java-program-to-emulate-n-dice-roller/
 * Utilisation de ce site pour la cr�ation d'un objet d�
 * (je remplace void par int pour que le r�sultat des d�s soit retourn�s par la classe).
 */

import java.util.Random;
import java.util.Scanner;
 
public class Dice {
	/** Cr�ation d'une classe statique avec pour param�tre le nombre de d�s.
	 * @param numberOfDice
	 * @return le total des r�sultats des d�s.
	 */
    public static int roll(int numberOfDice)
    {
    	/*
    	 * Nouvelle instance de l'objet Random
    	 */
        Random ranNum = new Random();
 
        System.out.print("You rolled: ");
        int total = 0;
        int randomNumber = 0;
 
        /*
         *  Mise en place de la boucle for qui "Lance les d�s".
         *  On utilise le nombre de d�s comme nombre de tours de boucle,
         *  afin d'utiliser le total des r�sultats de chaque d�.
         */
        for (int i = 0; i < numberOfDice; i++) {
 
            /* Generating the random number and storing it
            * in the 'randomNumber' variable */
            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(". ");
        }
        
        /* Affichage des r�sultats des d�s,
         * Les r�sultats de la boucle s�par�s d'un espace,
         * puis le total.
         */
        System.out.println(" Total: " + total +".");
        /* Return du total pour pourvoir utiliser le r�sultat. */
        return total;
    }

}