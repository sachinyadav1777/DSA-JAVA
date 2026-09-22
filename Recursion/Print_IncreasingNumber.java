package Recursion;

public class Print_IncreasingNumber {
    public static void printInc(int num) {
        if (num == 1) {
            System.out.print(num+" ");
            return;
        }
        printInc(num - 1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        printInc(10);
    }
}
