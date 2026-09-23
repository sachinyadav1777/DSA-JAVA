package Recursion;

public class Print_DecreasingNumber {
    public static void printDec(int num ) {
        if(num == 1) {
            System.out.print(num+" ");
            return;
        }
        System.out.print(num+" ");
        printDec(num-1);
    }
    public static void main(String[] args) {
        printDec(10);
    }
}
