package calculator.view;

public class OutputView {
    private static final String OUTPUT_PROMPT = "결과 : ";
    private final String ERROR_PROMPT = "에러 : ";

    public void printResult(Integer res) {
        System.out.println(OUTPUT_PROMPT + res);
    }

    public void printError(String errMessage) {
        System.out.println(ERROR_PROMPT + errMessage);
    }
}
