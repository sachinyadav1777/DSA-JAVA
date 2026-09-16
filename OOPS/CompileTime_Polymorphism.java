package OOPS;

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
    float sum(float a, float b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
public class CompileTime_Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(7,9));
        System.out.println(cal.sum(7.5f,9.3f));
        System.out.println(cal.sum(3,8,10));
    }
}
