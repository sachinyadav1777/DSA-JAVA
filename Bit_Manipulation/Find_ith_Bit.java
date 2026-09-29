package Bit_Manipulation;

import java.util.Scanner;

public class Find_ith_Bit {
    public static int getIthBit(int n, int key) {
        int bitMask = 1 << key;
        if((n & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position to check bit: ");
        int key = sc.nextInt();
        System.out.println(getIthBit(num,key));
    }
}
