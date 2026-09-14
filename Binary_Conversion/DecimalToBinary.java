package Binary_Conversion;

import java.util.Scanner;

public class DecimalToBinary {
    public static int decToBin(int n) {
        int binNum = 0;
        int pow = 1;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + rem * pow;
            n /= 2;
            pow *= 10;
        }
        return binNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n = sc.nextInt();
        int result = decToBin(n);
        System.out.println("The Binary Number is " + result);
        sc.close();
    }
}
