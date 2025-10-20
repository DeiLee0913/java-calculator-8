package calculator.controller;

import calculator.model.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculateController {
    private final InputView inputView;
    private final OutputView outputView;
    private final StringCalculator stringCalculator;

    public CalculateController(InputView inputView, OutputView outputView, StringCalculator stringCalculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.stringCalculator = stringCalculator;
    }

    public void run() {
        try {
            String input = inputView.readString();
            int result = stringCalculator.calculate(input);
            outputView.printResult(result);
        } catch (IllegalArgumentException e) {
            outputView.printError(e.getMessage());
            // 테스트가 예외를 감지할 수 있도로 예외 다시 던지기
            throw e;
        }
    }
}
