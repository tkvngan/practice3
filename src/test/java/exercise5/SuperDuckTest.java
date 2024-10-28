package exercise5;

// TestSuperDuck.java
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SuperDuckTest {
    @Test
    void testFlyAndSwim() {
        SuperDuck superDuck = new SuperDuck();

        assertEquals("SuperDuck is flying", captureOutput(superDuck::fly));
        assertEquals("SuperDuck is swimming", captureOutput(superDuck::swim));
    }

    private String captureOutput(Runnable method) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        method.run();
        return outContent.toString().trim();
    }
}
