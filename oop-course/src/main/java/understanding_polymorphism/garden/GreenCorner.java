package understanding_polymorphism.garden;

public class GreenCorner {

    public final HousePlant[] housePlants = new HousePlant[3];

    public void waterAll() {
        for (HousePlant housePlant : housePlants) {
            housePlant.water();
        }
    }

    public void admire() {
        System.out.println("I can see:");
        for (HousePlant housePlant : housePlants) {
            System.out.println(housePlant.getFlowersDescription());
        }
    }
}
