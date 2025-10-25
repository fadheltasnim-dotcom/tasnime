package tp2;

public class cercle {
    double rayon;
    static final double PI = 3.14; 

    public cercle(double rayon) {
        this.rayon = rayon;
    }

 
    public double surface() {
        return PI * rayon * rayon;
    }
}
