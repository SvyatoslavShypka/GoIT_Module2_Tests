package com.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class TestsAll {

    private static SumCalculator sumCalculator;
    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }
    @Test
    void sumZero(){
        assertThrowsExactly(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

    @Test
    void sumMinus(){
        assertThrowsExactly(IllegalArgumentException.class, () -> sumCalculator.sum(-5));
    }

    @Test
    void sumOne(){
        Assertions.assertEquals(1,sumCalculator.sum(1));
    }
    @Test
    void sumThree(){
        Assertions.assertEquals(6,sumCalculator.sum(3));
    }

}