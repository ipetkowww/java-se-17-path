package transforming_strings;

public class RemoveWhiteSpacesDemo {

    public static void main(String[] args) {
        System.out.println("hello    ".trim() + "    there".trim()); // hellothere

        char space = '\u2002';
        System.out.println("\\u2002 is whitespace: " + Character.isWhitespace(space)); // \u2002 is whitespace: true

        System.out.println("hello\u2002".trim() + "\u2002there".trim()); // hello there
        System.out.println("hello\u2002".strip() + "\u2002there".strip()); // hellothere
    }
}
