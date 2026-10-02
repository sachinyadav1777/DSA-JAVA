package Bit_Manipulation;

import java.util.Scanner;

public class Clear_Last_i_Bits {
    public static int clearLastIBits(int num , int i) {
        int bitMask = (-1) << i;
        return num & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        System.out.print(clearLastIBits(num,pos));
    }
}
