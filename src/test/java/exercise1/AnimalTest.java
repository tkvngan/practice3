package exercise1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    void testMakeSound() {
        Animal genericAnimal = new Animal("Animal", 3);
        Dog dog = new Dog("Buddy", 5);

        assertEquals("Generic animal sound", captureOutput(genericAnimal::makeSound));
        assertEquals("Woof!", captureOutput(dog::makeSound));
    }

    // Utility method to capture printed output
    private String captureOutput(Runnable method) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        method.run();
        return outContent.toString().trim();
    }
}
