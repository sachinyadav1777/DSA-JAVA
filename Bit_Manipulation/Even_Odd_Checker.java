package Bit_Manipulation;

import java.util.Scanner;

public class Even_Odd_Checker {
    public static void evenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        evenOrOdd(num);
    }
}
