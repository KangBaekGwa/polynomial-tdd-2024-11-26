package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {

    @DisplayName("11+12 = ?")
    @Test
    void 기본_더하기_계산() {
        // given
        String polynomial = "11 + 12";

        // when
        int result = Calc.run(polynomial);

        // then
        assertThat(result).isEqualTo(23);
    }
}
