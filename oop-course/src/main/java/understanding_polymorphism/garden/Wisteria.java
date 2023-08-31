package understanding_polymorphism.garden;

public class Wisteria extends HousePlant {

    public Wisteria(int height) {
        super(height);
    }

    @Override
    public String getFlowersDescription() {
        return "A cascade of purple flowers";
    }
}

