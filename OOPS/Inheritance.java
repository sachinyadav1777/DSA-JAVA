package OOPS;

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swim in water");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
    }
}
