package Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0,end = arr.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter the array element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key value you want to find: ");
        int key = sc.nextInt();
        Arrays.sort(arr);
        int index = binarySearch(arr, key);
        if(index == -1) {
            System.out.println("Number not found in an Array");
        }
        else {
            System.out.println("Number found at index "+index);
        }
        sc.close();
    }
}
