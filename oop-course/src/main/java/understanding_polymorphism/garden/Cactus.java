package understanding_polymorphism.garden;

public class Cactus extends HousePlant {

    private boolean hasBeenWatered;

    public Cactus(int height) {
        super(height);
    }

    @Override
    public String getFlowersDescription() {
        return hasBeenWatered ? "A beautiful yellow flower" : super.getFlowersDescription();
    }

    @Override
    public void water() {
        super.water();
        hasBeenWatered = true;
    }
}
