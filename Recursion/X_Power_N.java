package Recursion;

import java.util.Scanner;

public class X_Power_N {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        System.out.print("Enter the Power: ");
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" = "+power(x,n));
    }
}
