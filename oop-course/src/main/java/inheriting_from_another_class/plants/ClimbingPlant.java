package inheriting_from_another_class.plants;

public class ClimbingPlant extends HousePlant {

    public ClimbingPlant(int height) {
        super(height);
    }

    @Override
    protected void grow() {
        for (int i = 0; i < 3; i++) {
            super.grow();
        }
    }
}
