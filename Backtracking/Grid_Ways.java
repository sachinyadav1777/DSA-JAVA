package Backtracking;

import java.util.Scanner;

public class Grid_Ways {
    public static int gridWays(int[][] arr, int row, int col) {
        if(row == arr.length-1 || col == arr[0].length-1) {
            return 1;
        }
        else if(row == arr.length || col == arr[0].length) {
            return 0;
        }
        int right = gridWays(arr,row,col+1);
        int down = gridWays(arr,row+1,col);
        return right + down;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int col = sc.nextInt();
        int[][] grid = new int[row][col];
        System.out.println("Total no. of ways = "+ gridWays(grid,0,0));
    }
}
