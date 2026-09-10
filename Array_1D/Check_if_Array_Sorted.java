package Array_1D;

import java.util.Scanner;

public class Check_if_Array_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Array Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("Array is Sorted");

        else
            System.out.println("Array is Not Sorted");
        sc.close();
    }
}
