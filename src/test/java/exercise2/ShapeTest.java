package exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    void testCalculateArea() {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        assertEquals(28.27, circle.calculateArea(), 0.01);
        assertEquals(20, rectangle.calculateArea(), 0.01);
    }
}
