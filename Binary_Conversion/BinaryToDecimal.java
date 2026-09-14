package Binary_Conversion;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binToDec(int n) {
        int base = 1;
        int decNum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            decNum = decNum + rem * base;
            base = base * 2;
        }
        return decNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number: ");
        int n = sc.nextInt();
        int decimal = binToDec(n);
        System.out.println("The Decimal Number is " + decimal);
        sc.close();
    }
}
