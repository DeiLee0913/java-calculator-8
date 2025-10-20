package calculator.model;

public class StringCalculator {
    public boolean isStringEmpty(String input) {
        return input == null || input.isEmpty();
    }

    public String[] parseInput(String input) {
        String dividers = ":,";

        // Extract Custom Splitters
        if (input.startsWith("//")) {
            int idx =  input.indexOf("\\n");
            dividers += input.substring(2, idx);
            input = input.substring(idx + 2);
        }

        // Extract numbers by splitting
        return input.split("[" + dividers + "]");
    }



    public int calculate(String input) {
        if (isStringEmpty(input)) {
            return 0;
        } else {
//            return (parseInput(input));
        }
    }
}
