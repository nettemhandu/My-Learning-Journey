package za.co.simulation;

public abstract class Animal {
    public abstract void makeSound();

    public void eat(String name) {
        System.out.println(name + " is eating...");
    }
}
