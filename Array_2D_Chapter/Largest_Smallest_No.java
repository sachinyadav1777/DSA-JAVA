package Array_2D_Chapter;

import java.util.Scanner;

public class Largest_Smallest_No {
    public static void largestSmallest(int [][] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                if(arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
                else {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is "+largest);
        System.out.println("Smallest Element is "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the No. of Columns: ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                System.out.print("Enter the Element of ("+i+","+j+") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        largestSmallest(arr);
    }
}
