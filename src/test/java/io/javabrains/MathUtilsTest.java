package io.javabrains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void test() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected, actual);

    }

    @Test
    void testDivide() {
        MathUtils mathUtils = new MathUtils();
        mathUtils.divide(1,0);

    }

//    @Test
//    void testComputeCircleRadius() {
//        MathUtils mathUtils = new MathUtils();
//        assertEquals(314.15926665434, mathUtils.computeCircleArea(10), "Should return the right circle area");
//    }
}