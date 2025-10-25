package tp2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cercle c = new cercle();
        System.out.print("Entrez le rayon du cercle : ");
        c.rayon = sc.nextDouble();
        System.out.println("La surface du cercle est : " + c.surface());

        rectangle r = new rectangle();
        System.out.print("Entrez la longueur du rectangle : ");
        r.longueur = sc.nextDouble();
        System.out.print("Entrez la largeur du rectangle : ");
        r.largeur = sc.nextDouble();
        System.out.println("La surface du rectangle est : " + r.surface());
    }
}
