package Bit_Manipulation;

import java.util.Scanner;

public class Find_Complement {
    public static int findComplement(int num) {
        int bitMask = 1;
        while (bitMask < num) {
            bitMask = (bitMask << 1) | 1;
        }
        return bitMask ^ num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(findComplement(num));
    }
}
