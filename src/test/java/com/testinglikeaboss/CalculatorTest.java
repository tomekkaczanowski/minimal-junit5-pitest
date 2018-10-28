package com.testinglikeaboss;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void zeroCheck() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculateWhatever(0)).isTrue();
    }
}