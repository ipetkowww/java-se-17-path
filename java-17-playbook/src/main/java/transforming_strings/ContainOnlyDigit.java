package transforming_strings;

public class ContainOnlyDigit {

    public static void main(String[] args) {
        String s = "ivan123~asd";
        String digitsOnly = "4395039450345";

        System.out.println("Using containsDigitOnlyLoop() method:");
        System.out.println(s + " contains only digits: " + containsDigitOnlyLoop(s));
        System.out.println(digitsOnly + " contains only digits: " + containsDigitOnlyLoop(digitsOnly));
        System.out.println();

        System.out.println("Using containsDigitOnlyFunctional() method:");
        System.out.println(s + " contains only digits: " + containsDigitOnlyFunctional(s));
        System.out.println(digitsOnly + " contains only digits: " + containsDigitOnlyFunctional(digitsOnly));
        System.out.println();

        System.out.println("Using containsDigitOnlyRegex() method:");
        System.out.println(s + " contains only digits: " + containsDigitOnlyRegex(s));
        System.out.println(digitsOnly + " contains only digits: " + containsDigitOnlyRegex(digitsOnly));
        System.out.println();
    }

    private static boolean containsDigitOnlyLoop(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsDigitOnlyFunctional(String s) {
        return s.chars().allMatch(Character::isDigit);
    }

    private static boolean containsDigitOnlyRegex(String s) {
        return s.matches("[0-9]+");
    }
}
