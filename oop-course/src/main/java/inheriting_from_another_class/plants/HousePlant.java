package inheriting_from_another_class.plants;

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

    protected void grow() {
        height++;
    }
}
