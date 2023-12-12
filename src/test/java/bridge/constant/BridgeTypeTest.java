package bridge.constant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("[BridgeType] : BridgeType Enum 테스트")
class BridgeTypeTest {

    @DisplayName("정수 0을 입력하면 DOWN 타입의 값이 반환된다.")
    @Test
    void convertNumberToDownType() throws Exception {
        // Given
        int inputNumber = 0;

        // When
        String convertValue = BridgeType.convertNumberToBridgeValue(inputNumber);

        // Then
        assertThat(convertValue).isEqualTo("D");
    }

    @DisplayName("정수 1을 입력하면 UP 타입의 값이 반환된다.")
    @Test
    void convertNumberToUpType() throws Exception {
        // Given
        int inputNumber = 1;

        // When
        String convertValue = BridgeType.convertNumberToBridgeValue(inputNumber);

        // Then
        assertThat(convertValue).isEqualTo("U");
    }
    
    @DisplayName("0 혹은 1 이외의 정수를 입력하면 예외가 발생한다.")  
    @Test        
    void convertInvalidNumberToBridgeType() throws Exception {
        // Given
        int invalidNumber = 3;
                
        // When & Then
        assertThatThrownBy(() -> BridgeType.convertNumberToBridgeValue(invalidNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("일치하는 다리 타입이 존재하지 않습니다.");
    }
}
