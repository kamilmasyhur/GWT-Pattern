package com.kamilmasyhur.gwtpattern.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class AnotherCalculatorTest {
    val calculator = Calculator()
    val initialValue = 0
    val addedValue = 10
    val expectedResult = 10
    var result = 0

    @Test
    @DisplayName("Given Calculator, When Adding 2 number, Then should add two number")
    fun thenCondition() {
        result = calculator.add(initialValue, addedValue)

        Assertions.assertEquals(expectedResult, result)
    }
}
