package assignment;
import java.util.*;

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    void eat() {
        System.out.println("Athlete eats a protein-rich diet.");
    }
    void exercise() {
        System.out.println("Athlete exercises vigorously every day.");
    }
}

class LazyPerson extends Person {
    void eat() {
        System.out.println("Lazy person eats junk food casually.");
    }
    void exercise() {
        System.out.println("Lazy person hardly exercises.");
    }
}

public class Problem21 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        lazy.eat();
        lazy.exercise();
    }
}

/*
Athlete eats a protein-rich diet.
Athlete exercises vigorously every day.
Lazy person eats junk food casually.
Lazy person hardly exercises.
*/