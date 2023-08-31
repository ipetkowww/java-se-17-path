package understanding_polymorphism.animals;

public class Program {

    public static void main(String[] args) {
        Marsupial hopper = createMarsupial();
        Kangaroo k = ((Kangaroo)hopper);
    }

    static Marsupial createMarsupial() {
        return new Kangaroo();
    }
}
