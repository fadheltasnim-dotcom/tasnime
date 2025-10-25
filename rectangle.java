package tp2;

public class rectangle {
    double longueur;
    double largeur;

    public rectangle() { }

  
    public rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

 
    double surface() {
        return longueur * largeur;
    }
}
