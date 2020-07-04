package com.kamilmasyhur.gwtpattern.domain

import org.junit.jupiter.api.*

@DisplayName("Given Calculator")
internal class CalculatorTest {
    val calculator = Calculator()
    val initialValue = 0
    val addedValue = 10
    val expectedResult = 10
    var result = 0

    @DisplayName("When Adding 2 number")
    @Nested
    inner class Add {
        @BeforeEach
        fun whenCondition() {
            result = calculator.add(initialValue, addedValue)
        }

        @Test
        @DisplayName("Then should add two number")
        fun thenCondition() {
            Assertions.assertEquals(expectedResult, result)
        }
    }
}
