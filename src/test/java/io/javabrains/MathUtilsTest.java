package io.javabrains;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit() {
        System.out.print("This needs to run before all");
    }

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanUp() {
        System.out.println("Cleaning up..........");
    }

    @Test
    @DisplayName("Testing add method")
    void test() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    @DisplayName("multiple method")
    @Tag("Math")
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2,2)),
                () -> assertEquals(0, mathUtils.multiply(2,0)),
                () -> assertEquals(-1, mathUtils.multiply(-1,1)),
                () -> assertEquals(40, mathUtils.multiply(40,1)),
                () -> assertEquals(999, mathUtils.multiply(9,111))
        );
    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide() {
        boolean isServerUp = true;
        assumeTrue(isServerUp);
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0));
    }

    @Nested
    @DisplayName("Add method")
    @Tag("Math")
    class addTest {

        @Test
        @DisplayName("Positive add")
        void testAddPositive() {
            assertEquals(2, mathUtils.add(1,1), "The add method should add two numbers");
        }

        @Test
        @DisplayName("Negative add")
        void testAddNegative() {
            assertEquals(-2, mathUtils.add(-1,-1));
        }
    }
}