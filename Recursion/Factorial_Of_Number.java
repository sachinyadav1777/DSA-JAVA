package Recursion;

import java.util.Scanner;

public class Factorial_Of_Number {
    public static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return num * Factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("factorial of "+num+" is: "+Factorial(num));
    }
}
