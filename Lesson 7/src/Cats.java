public class Cats {
    public Cats() {
    }

    public static void eatMassive(Plate p, Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(p);
        }
    }
}