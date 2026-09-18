package Recursion;

import java.util.Scanner;

public class Sum_OfN_NaturalNumbers {
    public static int sumNaturalNumber(int num) {
        if (num == 1) {
            return num;
        }
        return sumNaturalNumber(num - 1) + num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Sum of Natural Numbers = "+sumNaturalNumber(num));
    }
}
