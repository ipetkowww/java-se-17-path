package understanding_polymorphism.garden;

public class Gardening {
    public static void main(String[] args) {
        GreenCorner greenCorner = new GreenCorner();
        greenCorner.housePlants[0] = new Wisteria(5);
        greenCorner.housePlants[1] = new Geranium(2);
        greenCorner.housePlants[2] = new Geranium(3);

        greenCorner.admire();
    }
}
