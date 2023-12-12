package bridge.service;

import bridge.domain.Bridge;
import bridge.domain.BridgeMaker;

import java.util.List;

public class BridgeService {

    private final BridgeMaker bridgeMaker;

    public BridgeService(BridgeMaker bridgeMaker) {
        this.bridgeMaker = bridgeMaker;
    }

    public Bridge createBridge(int bridgeSize) {
        List<String> bridgeValue = bridgeMaker.makeBridge(bridgeSize);

        return new Bridge(bridgeValue);
    }
}
