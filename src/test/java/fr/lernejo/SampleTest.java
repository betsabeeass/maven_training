package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void testOpAdd() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD, 3, 4);
        assertEquals(7, result, "3 + 4 should be 7");
    }

    @Test
    void testOpMult() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT, 3, 4);
        assertEquals(12, result, "3 4 should be 12");
    }

    @Test
    void testFactPositive() {
        Sample sample = new Sample();
        int result = sample.fact(5);
        assertEquals(120, result, "Factorial of 5 should be 120");
    }

    @Test
    void testFactZero() {
        Sample sample = new Sample();
        int result = sample.fact(0);
        assertEquals(1, result, "Factorial of 0 should be 1");
    }

    @Test
    void testFactNegative() {
        Sample sample = new Sample();
        assertThrows(IllegalArgumentException.class, () -> sample.fact(-1), "Negative factorial should throw exception");
    }
}
