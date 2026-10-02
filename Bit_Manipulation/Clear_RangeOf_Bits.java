package Bit_Manipulation;

import java.util.Scanner;

public class Clear_RangeOf_Bits {
    public static int clearBitsInRange(int num, int i, int j) {
        int a = (-1) << (j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return num & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the first boundary: ");
        int i = sc.nextInt();
        System.out.print("Enter the second Boundary: ");
        int j = sc.nextInt();
        System.out.println(clearBitsInRange(num,i,j));
    }
}