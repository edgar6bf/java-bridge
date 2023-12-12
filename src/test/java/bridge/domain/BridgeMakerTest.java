package bridge.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("[BridgeMaker] : 다리 생성기 테스트")
class BridgeMakerTest {

    @DisplayName("다리 길이를 입력하면 입력 길이 크기의 다리를 생성한다.")
    @Test
    void createBridge() throws Exception {
        // Given
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        int inputBridgeSize = 4;

        // When
        List<String> createdBridge = bridgeMaker.makeBridge(inputBridgeSize);

        // Then
        assertThat(createdBridge).hasSize(inputBridgeSize);
    }
}
