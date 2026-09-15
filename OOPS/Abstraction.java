package OOPS;

abstract class AnimalS {
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends AnimalS {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends AnimalS {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
