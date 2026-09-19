package Recursion;

import java.util.Scanner;

public class Search_In_Rotated_SortedArray {
    public static int search(int[] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si +(ei-si)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr,target,si,mid);
            }
            else {
                return search(arr,target,mid+1,ei);
            }
        }
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr,target,mid+1,ei);
            }
            else {
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++) {
            System.out.print("Enter the Element at index "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to search: ");
        int target = sc.nextInt();
        int tIdx = search(arr,target,0,arr.length-1);
        if (tIdx >= 0) {
            System.out.println("Element found at Index "+tIdx);
        }
        else {
            System.out.println("Element not Found in an Array");
        }
    }
}
