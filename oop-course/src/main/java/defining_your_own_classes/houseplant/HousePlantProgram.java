package defining_your_own_classes.houseplant;

public class HousePlantProgram {
    public static void main(String[] args) {
        System.out.println("Creating houseplant...");
        HousePlant plant = new HousePlant(5);

        System.out.println("The plant's height (it should be 5): " + plant.getHeight());

        for (int i = 0; i < 3; i++) {
            System.out.println("Watering houseplant...");
            plant.water();
        }

        System.out.println("The current height (it should be 8 after watering): " + plant.getHeight());
    }
}
