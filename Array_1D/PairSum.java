package Array_1D;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Array Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target Value: ");
        int target = sc.nextInt();
        boolean isFound = false;
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(arr[i]+arr[j] == target) {
                    isFound = true;
                    break;
                }
            }
        }
        if(isFound) {
            System.out.println("Pairs Found");
        }
        else {
            System.out.println("Pairs not found");
        }
    }
}
