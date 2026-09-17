package OOPS;

public class Interface {
    interface I1 {
        int a = 67;

        void show();
    }

    static class Test implements I1 {
        public void show() {
            System.out.println("Sachin");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        System.out.println(I1.a);
    }
}
