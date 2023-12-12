package bridge.constant;

public enum BridgeSize {

    BRIDGE_MINIMUM_SIZE(3),
    BRIDGE_MAXIMUM_SIZE(20);

    private int value;

    BridgeSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
