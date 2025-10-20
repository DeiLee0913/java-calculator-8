package calculator.model;

public class StringCalculator {
    public boolean isStringEmpty(String input) {
        return input == null || input.isEmpty();
    }

    public int calculate(String input) {
        if (isStringEmpty(input)) {
            return 0;
        }
    }
}
