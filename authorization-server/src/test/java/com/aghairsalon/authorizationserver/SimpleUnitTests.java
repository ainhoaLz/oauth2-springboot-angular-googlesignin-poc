package com.aghairsalon.authorizationserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleUnitTest {

    @Test
    void sumOfTwoNumbersReturnsCorrectResult() {
        int a = 5;
        int b = 5;
        int expectedResult = 10;
        
        assertEquals(expectedResult, a + b, "The sum should work correctly");
    }
}