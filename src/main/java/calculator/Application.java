package calculator;

import calculator.controller.CalculateController;
import calculator.model.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        StringCalculator stringCalculator = new StringCalculator();
        CalculateController calculateController = new CalculateController(inputView, outputView, stringCalculator);

        calculateController.run();
    }
}
