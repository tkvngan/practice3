package exercise3;

// TestMovable.java
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MovableTest {
    @Test
    void testMove() {
        Movable car = new Car();
        Movable bicycle = new Bicycle();

        assertEquals("Car is moving", captureOutput(car::move));
        assertEquals("Bicycle is moving", captureOutput(bicycle::move));
    }

    private String captureOutput(Runnable method) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        method.run();
        return outContent.toString().trim();
    }
}
