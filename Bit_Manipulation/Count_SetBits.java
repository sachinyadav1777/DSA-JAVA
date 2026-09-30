package Bit_Manipulation;

import java.util.Scanner;

public class Count_SetBits {
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("No. of Set Bits in a Number is "+countSetBits(num));
    }
}
