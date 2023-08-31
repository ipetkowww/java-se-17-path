package understanding_polymorphism.garden;

public class HousePlant {

    private int height;

    public HousePlant(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void water() {
        grow();
    }

    public String getFlowersDescription() {
        return "No flower here";
    }

    protected void grow() {
        height++;
    }
}
