package OOPS;

public class RunTime_Polymorphism {
    static class Animals {
        void eat() {
            System.out.println("Eat anything");
        }
    }
    static class Deer extends Animals {
        void eat() {
            System.out.println("Eat Grass");
        }
    }
    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();
        Animals d = new Deer();
        d.eat();
    }
}
