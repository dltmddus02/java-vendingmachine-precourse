package vendingmachine.view.input;

import java.util.regex.Pattern;
import vendingmachine.view.input.exception.InputErrorMessage;
import vendingmachine.view.input.exception.InputException;

public class InputValidator {
    private final static String COMMA = ",";

    public static void validateNotNullOrEmpty(String input) {
        if (input == null || input.isEmpty()) {
            throw new InputException(InputErrorMessage.INVALID_INPUT);
        }
    }

    public static void validatePositiveInteger(String input) {
        validateNotNullOrEmpty(input);
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InputException(InputErrorMessage.MUST_BE_INTEGER);
        }
        if (Integer.parseInt(input) < 0) {
            throw new InputException(InputErrorMessage.MUST_BE_INTEGER);
        }
    }

    public static void validateFormat(String input) {
        if (!isCorrectFormat(input)) {
            throw new InputException(InputErrorMessage.INVALID_INPUT);
        }
    }

    private static boolean isCorrectFormat(String input) {
        String productNamePattern = "[가-힣]+";
        String numberPattern = "[0-9]+";

        String singlePattern = String.format("\\[(%s),(%s),(%s)]", productNamePattern, numberPattern, numberPattern);
        String repeatPattern = String.format("%s(;%s)*", singlePattern, singlePattern);

        Pattern correctPattern = Pattern.compile("^" + repeatPattern + "$");

        return correctPattern.matcher(input).find();
    }
}
