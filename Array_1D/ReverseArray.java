package Array_1D;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0,end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the Size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Array Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed Array: ");
        reverseArray(arr);
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
