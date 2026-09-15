package OOPS;

class Animals {
    void eat() {
        System.out.println("Eat anything");
    }
}
class Deer extends Animals {
    void eat() {
        System.out.println("Eat Grass");
    }
}
public class RunTime_Polymorphism {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();
    }
}
