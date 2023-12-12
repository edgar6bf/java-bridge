package bridge.service;

import bridge.domain.Bridge;
import bridge.domain.BridgeMaker;
import bridge.domain.BridgeRandomNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("[BridgeService] : Bridge 서비스 테스트")
class BridgeServiceTest {

    @DisplayName("다리 길이를 입력하면 입력 길이의 다리가 담긴 Bridge 객체를 생성한다.")
    @Test
    void createBridgeObject() throws Exception {
        // Given
        BridgeService bridgeService = initBridgeService();
        int inputBridgeSize = 4;

        // When
        Bridge bridge = bridgeService.createBridge(inputBridgeSize);

        // Then
        assertThat(bridge).isNotNull();
    }

    private BridgeService initBridgeService() {
        return new BridgeService(new BridgeMaker(new BridgeRandomNumberGenerator()));
    }
}
