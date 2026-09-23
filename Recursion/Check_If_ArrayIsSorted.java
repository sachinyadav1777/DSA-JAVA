package Recursion;

import java.util.Scanner;

public class Check_If_ArrayIsSorted {
    public static boolean isSorted(int [] arr,int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the Array Element "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}
