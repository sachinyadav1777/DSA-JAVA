package Array_2D_Chapter;

import java.util.Scanner;

public class Search_Element_Sorted2DArray {
    public static void staircaseSearch(int [][] arr , int key) {
        int row = 0;
        int col = arr[0].length-1;
        while(row < arr.length && col >= 0) {
            if(arr[row][col] == key) {
                System.out.print("Element found at ("+row+","+col+")");
                return;
            }
            else if (key < arr[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Element not found");
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
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        staircaseSearch(arr,key);
    }
}
