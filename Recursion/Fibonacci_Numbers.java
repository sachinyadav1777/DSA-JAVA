package Recursion;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Term no. : ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Number at "+num+" is: "+fibonacci(num));
    }
}
