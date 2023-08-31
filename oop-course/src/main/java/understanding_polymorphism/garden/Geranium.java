package understanding_polymorphism.garden;

public class Geranium extends HousePlant {

    public Geranium(int height) {
        super(height);
    }

    @Override
    public String getFlowersDescription() {
        return "Clusters of red flowers";
    }
}

