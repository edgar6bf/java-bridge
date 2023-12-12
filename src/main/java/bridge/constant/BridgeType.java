package bridge.constant;

import java.util.Arrays;

public enum BridgeType {
    UP(1, "U"),
    DOWN(0, "D");

    private int number;
    private String value;

    BridgeType(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public static String convertNumberToBridgeValue(int number) {
        return Arrays.stream(BridgeType.values())
                .filter(bridgeType -> bridgeType.checkNumber(number))
                .findAny()
                .map(BridgeType::getValue)
                .orElseThrow(() -> new IllegalArgumentException("일치하는 다리 타입이 존재하지 않습니다."));
    }

    private boolean checkNumber(int inputNumber) {
        return number == inputNumber;
    }

    private String getValue() {
        return value;
    }
}
