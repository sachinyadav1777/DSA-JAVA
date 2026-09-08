package Array_1D;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int num) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter the array element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to Search: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if(index != -1)
            System.out.print("Number not found in an array");
        else
            System.out.print("Number found at index "+index);
        sc.close();
    }
}
