package Bit_Manipulation;

import java.util.Scanner;

public class Power_Of_2_OrNot {
    public static boolean isPowerOfTwo(int num) {
        int bitMask = num & (num-1);
        if(bitMask == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print(isPowerOfTwo(num));
    }
}
