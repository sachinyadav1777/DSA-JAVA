package OOPS;

public class Abstraction {
    static abstract class AnimalS {
        void eat() {
            System.out.println("animal eats");
        }
        abstract void walk();
    }
    static class Horse extends AnimalS {
        void walk() {
            System.out.println("walks on 4 legs");
        }
    }
    static class Chicken extends AnimalS {
        void walk() {
            System.out.println("walks on 2 legs");
        }
    }
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
