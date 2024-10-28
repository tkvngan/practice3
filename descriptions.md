### **Exercise 1: Class Inheritance and Overriding Methods**
**Problem:**  
Create two classes:
1. `Animal` - A base class with data members `name` and `age`. It should have a method `makeSound()` that prints `"Generic animal sound"`.
2. `Dog` - A derived class that overrides the `makeSound()` method to print `"Woof!"`.

**Unit Test:**  
Verify that the `makeSound()` method behaves differently for `Animal` and `Dog`.

```java
// AnimalTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
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
```

---

### **Exercise 2: Abstract Classes**
**Problem:**  
Create an abstract class `Shape` with a method `calculateArea()`. Create two subclasses, `Circle` and `Rectangle`, that extend `Shape`. Implement the `calculateArea()` method in each subclass.

**Unit Test:**  
Test the `calculateArea()` method for a `Circle` with radius 3 and a `Rectangle` with width 4 and height 5.

```java
// ShapeTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testCalculateArea() {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        assertEquals(28.27, circle.calculateArea(), 0.01);
        assertEquals(20, rectangle.calculateArea(), 0.01);
    }
}
```

---

### **Exercise 3: Interfaces and Implementing Interfaces**
**Problem:**  
Create an interface `Movable` with a method `move()`. Implement the `Movable` interface in two classes:
1. `Car` - Prints `"Car is moving"`
2. `Bicycle` - Prints `"Bicycle is moving"`

**Unit Test:**  
Verify that the `move()` method works correctly for both `Car` and `Bicycle`.

```java
// MovableTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovableTest {
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
```

---

### **Exercise 4: Access Modifiers in Inheritance**
**Problem:**  
Create a base class `Person` with `protected` members `name` and `age`. Create a derived class `Employee` that extends `Person` and adds a `salary` field. Implement a method in `Employee` called `printDetails()` that prints the name, age, and salary.

**Unit Test:**  
Test that `printDetails()` prints the correct information for an `Employee`.

```java
// EmployeeTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
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
```

---

### **Exercise 5: Multiple Interface Implementation**
**Problem:**  
Create two interfaces:
- `Flyable` with a method `fly()`
- `Swimmable` with a method `swim()`

Create a class `SuperDuck` that implements both interfaces.

**Unit Test:**  
Verify that calling `fly()` and `swim()` prints the correct outputs.

```java
// SuperDuckTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SuperDuckTest {
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
```

---

These exercises cover various aspects of inheritance, including overriding methods, abstract classes, implementing interfaces, and access modifiers. Each question is followed by unit tests to ensure the code behaves as expected.
