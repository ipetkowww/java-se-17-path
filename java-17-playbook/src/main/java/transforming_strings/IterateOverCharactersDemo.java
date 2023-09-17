package transforming_strings;

public class IterateOverCharactersDemo {

    public static void main(String[] args) {

        String str = "some string";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // do things with the char
        }

        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        System.out.println("Specific char to uppercase:");
        System.out.println(charToUpperCase(str, 's'));
        System.out.println(charToUpperCase(str, 'g'));
    }

    private static String charToUpperCase(String s, char charToUpper) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            char character = c == charToUpper ? Character.toUpperCase(c) : c;
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
