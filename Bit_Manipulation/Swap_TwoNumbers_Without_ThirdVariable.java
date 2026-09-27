package Bit_Manipulation;

import java.util.Scanner;

public class Swap_TwoNumbers_Without_ThirdVariable {
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("x = "+a+" and y = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int y = sc.nextInt();
        System.out.println("Before swapping: ");
        System.out.println("x = "+x+" and y = "+y);
        System.out.println("After swapping: ");
        swap(x,y);
    }
}
