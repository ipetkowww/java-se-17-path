package transforming_strings;

public class EmptyBlankDemo {

    public static void main(String[] args) {
        String s = " ";

        System.out.println(s.isEmpty()); // length of String == 0 -> returns false
        System.out.println(s.isBlank()); // true
    }

}
