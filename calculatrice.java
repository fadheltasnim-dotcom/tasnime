package tp2;
import java.util.Scanner;
public class calculatrice {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double a, b;
	        char operateur;

	        System.out.print("Entrez le premier nombre : ");
	        a = sc.nextDouble();

	        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
	        operateur = sc.next().charAt(0);

	        System.out.print("Entrez le deuxième nombre : ");
	        b = sc.nextDouble();

	        double resultat;

	        // Vérification de l’opérateur
	        if (operateur == '+') {
	            resultat = a + b;
	            System.out.println("Résultat : " + resultat);
	        } else if (operateur == '-') {
	            resultat = a - b;
	            System.out.println("Résultat : " + resultat);
	        } else if (operateur == '*') {
	            resultat = a * b;
	            System.out.println("Résultat : " + resultat);
	        } else if (operateur == '/') {
	            if (b != 0) {
	                resultat = a / b;
	                System.out.println("Résultat : " + resultat);
	            } else {
	                System.out.println("Erreur : division par zéro !");
	            }
	        } else {
	            System.out.println("Erreur : opérateur invalide !");
	        }

	        
	    }



}
