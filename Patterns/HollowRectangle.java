package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int row, int col) {
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                if(i==1 || j==1 || i==row || j==col) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int m = sc.nextInt();
        hollowRectangle(n, m);
        sc.close();
    }
}
