package bridge.controller;

import bridge.constant.BridgeSize;
import bridge.domain.Bridge;
import bridge.service.BridgeService;
import bridge.view.input.InputView;
import bridge.view.output.OutputView;

import static bridge.view.message.ErrorMessage.INPUT_BRIDGE_LENGTH_ERROR_MESSAGE;
import static bridge.view.message.InputMessage.INPUT_BRIDGE_LENGTH_MESSAGE;

public class BridgeController {

    private final InputView inputView;
    private final OutputView outputView;
    private final BridgeService bridgeService;

    public BridgeController(InputView inputView, OutputView outputView, BridgeService bridgeService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.bridgeService = bridgeService;
    }

    public void run() {
        Bridge bridge = initBridge();
    }

    private Bridge initBridge() {
        int bridgeLength = inputBridgeLength();

        return bridgeService.createBridge(bridgeLength);
    }

    private int inputBridgeLength() {
        try {
            return inputView.inputNumberInRange(
                    BridgeSize.BRIDGE_MINIMUM_SIZE.getValue(),
                    BridgeSize.BRIDGE_MAXIMUM_SIZE.getValue(),
                    INPUT_BRIDGE_LENGTH_MESSAGE
            );
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(INPUT_BRIDGE_LENGTH_ERROR_MESSAGE);

            return inputBridgeLength();
        }
    }
}
