package exercise4;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void testPrintDetails() {
        Employee employee = new Employee("Alice", 30, 50000);

        assertEquals("Name: Alice, Age: 30, Salary: 50000.00", captureOutput(employee::printDetails));
    }

    private String captureOutput(Runnable method) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        method.run();
        return outContent.toString().trim();
    }
}
