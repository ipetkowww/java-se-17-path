package transforming_strings;

public class TransformStringDemo {

    public static void main(String[] args) {
        String lotteryWin = " 100 usd ";
//        String result = lotteryWin.replaceAll("[a-z]", "").strip();
//
//        System.out.println(result);
//
//        String winMessage = printWinMessage(result);
//        System.out.println(winMessage.toUpperCase());

        String winMessage = lotteryWin.replaceAll("[a-z]", "")
                .strip()
                .transform(TransformStringDemo::printWinMessage)
                .toUpperCase();

        System.out.println(winMessage);
    }

    private static String printWinMessage(String number) {
        if (Integer.parseInt(number) < 100) {
            return "Nice! You've won: " + number;
        }
        return "Great news! You've won: " + number;
    }
}
