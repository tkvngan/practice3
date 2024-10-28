package exercise5;

// SuperDuck.java
public class SuperDuck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("SuperDuck is flying");
    }

    @Override
    public void swim() {
        System.out.println("SuperDuck is swimming");
    }
}
