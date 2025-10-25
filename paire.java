package tp2;
import java.util.Scanner;
public class paire {

	public static void main(String[] args) {
		

		
		 
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez un nombre : ");
	        String saisie = sc.nextLine();

	     
	        boolean estEntier = true;
	        int i = 0;

	        if (saisie.length() == 0) {
	            estEntier = false;
	        } else {
	         
	            if (saisie.charAt(0) == '-') {
	                if (saisie.length() == 1) {
	                    estEntier = false; 
	                } else {
	                    i = 1;
	                }
	            }

	           
	            for (; i < saisie.length(); i++) {
	                if (!Character.isDigit(saisie.charAt(i))) {
	                    estEntier = false;
	                    break;
	                }
	            }
	        }

	        if (estEntier) {
	            int nombre = Integer.parseInt(saisie);

	            System.out.println("Le nombre saisi est : " + nombre);

	            if (nombre % 2 == 0) {
	                System.out.println("C'est un nombre pair.");
	            } else {
	                System.out.println("C'est un nombre impair.");
	            }

	        } else {
	            System.out.println("Erreur : veuillez entrer un nombre entier valide !");
	        }


	}

}
