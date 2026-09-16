package OOPS;

public class Inheritance {
    static class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }
        void breathe() {
            System.out.println("breathes");
        }
    }
    static class Fish extends Animal {
        int fins;
        Fish(int val) {
            this.fins = val;
        }
        void swim() {
            System.out.println("swim in water");
        }
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.breathe();
        Fish f = new Fish(2);
        f.swim();
    }
}
