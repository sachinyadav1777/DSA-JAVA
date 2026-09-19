package Recursion;

import java.util.Scanner;

public class Optimized_X_Power_N {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x,n/2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}
