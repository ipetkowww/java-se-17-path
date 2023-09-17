package transforming_strings;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningStrings {

    public static void main(String[] args) {
        String delimiter = ";";
        String[] arr = {"1", "2", null, "5", "7", "10"};

        System.out.println(joinOldWay(delimiter, arr));
        System.out.println(joinSimplest(delimiter, arr));
        System.out.println(joinWithJoiner(delimiter, arr));
        System.out.println(joinWithStream(delimiter, arr));
    }

    private static String joinOldWay(String delimiter, String... args) {
        StringBuilder stringBuilder = new StringBuilder();

        int i;
        for (i = 0; i < args.length - 1; i++) {
            stringBuilder.append(args[i]).append(delimiter);
        }
        stringBuilder.append(args[i]);

        return stringBuilder.toString();
    }

    private static String joinSimplest(String delimiter, String... args) {
        return String.join(delimiter, args);
    }

    private static String joinWithJoiner(String delimiter, String... args) {
        StringJoiner stringJoiner = new StringJoiner(delimiter, "{", "}");
        for (String arg : args) {
            stringJoiner.add(arg);
        }
        return stringJoiner.toString();
    }

    private static String joinWithStream(String delimiter, String... args) {
        return Stream.of(args)
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(delimiter));
    }
}
