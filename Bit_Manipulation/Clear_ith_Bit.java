package Bit_Manipulation;

import java.util.Scanner;

public class Clear_ith_Bit {
    public static int clearIthBit(int num, int pos) {
        int bitMask = ~(1 << pos);
        return num & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println(clearIthBit(num,pos));
    }
}
