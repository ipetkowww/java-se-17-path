package _1_handling_exceptions;

public class Main {

    public static void main(String[] args) {
        int i = 12;
        int j = 2;

        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(); // Helpful during development
        }

        System.out.println("here after exception");
    }
}
