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

    public int calculateSum(String[] nums) {
        int res = 0;

        for(String num: nums) {
            int cur;
            try {
                cur = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자로 변환할 수 없는 입력값이 들어왔습니다.");
            }

            if (cur < 1) {
                throw new IllegalArgumentException("양수가 아닌 입력값이 들어왔습니다.");
            }

            res += cur;
        }

        return res;
    }

    public int calculate(String input) {
        if (isStringEmpty(input)) {
            return 0;
        } else {
            return (calculateSum(parseInput(input)));
        }
    }
}
