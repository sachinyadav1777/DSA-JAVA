package Bit_Manipulation;

import java.util.Scanner;

public class Set_ith_Bit {
    public static int setIthBit(int n, int key) {
        int bitMask = 1 << key;
        return n | bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position to change the bit: ");
        int pos = sc.nextInt();
        System.out.println(setIthBit(num,pos));
    }
}
