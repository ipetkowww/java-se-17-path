package common;

public class Calculator {

    public static void performOperation(String inputLine) {
        String[] parts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        int leftVal = valueFromWord(parts[1]);
        int rightVal = valueFromWord(parts[2]);

        int result = execute(operation, leftVal, rightVal);

        System.out.println(inputLine + " = " + result);
    }

    static int valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        int value = -1;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        if (value == -1) {
            value = Integer.parseInt(word);
        }

        return value;
    }

    private static int execute(MathOperation operation, int leftVal, int rightVal) {
        return switch (operation) {
            case ADD -> leftVal + rightVal;
            case SUBTRACT -> leftVal - rightVal;
            case MULTIPLY -> leftVal * rightVal;
            case DIVIDE -> leftVal / rightVal;
        };
    }
}
