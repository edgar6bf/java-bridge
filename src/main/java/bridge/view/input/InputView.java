package bridge.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public int inputNumberInRange(int minNumber, int maxNumber, String inputMessage) {
        printMessage(inputMessage);
        int inputNumber = parseNumber(Console.readLine());

        validateNumberRange(minNumber, maxNumber, inputNumber);

        return inputNumber;
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void validateNumberRange(int minNumber, int maxNumber, int targetNumber) {
        if (targetNumber < minNumber || targetNumber > maxNumber) {
            throw new IllegalArgumentException("유효한 범위의 정수 값이 아닙니다.");
        }
    }

    private int parseNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력 값이 정수가 아닙니다.");
        }
    }

    public String inputCharacter() {
        return null;
    }
}
