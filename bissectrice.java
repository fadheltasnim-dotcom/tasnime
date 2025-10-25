package tp2;
import java.util.Scanner;
public class bissectrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une année : ");
        int annee = sc.nextInt();

       
        if ((annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0)) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n'est pas une année bissextile.");
        }

        sc.close();
    }

}

