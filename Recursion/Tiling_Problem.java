package Recursion;

import java.util.Scanner;

public class Tiling_Problem {
    public static int tilingProblem(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int verticalChoice = tilingProblem(num-1);
        int horizontalChoice = tilingProblem(num-2);
        return verticalChoice + horizontalChoice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of area: ");
        int length = sc.nextInt();
        System.out.println("Total No. of ways to Arrange the tiles: "+tilingProblem(length));
    }
}
