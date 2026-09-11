package Array_2D_Chapter;

import java.util.Scanner;

public class Diagonal_Sum {
    public static int diagonalSum(int [][] matrix) {
        int sum = 0;
        for(int i = 0; i<matrix.length; i++) {
            sum += matrix[i][i];
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no. of Column: ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++) {
                System.out.print("Enter the Element ("+(i+1)+","+(j+1)+") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
    }
}
