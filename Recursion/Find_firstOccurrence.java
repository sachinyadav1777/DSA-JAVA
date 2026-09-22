package Recursion;

import java.util.Scanner;

public class Find_firstOccurrence {
    public static int firstOccurrence(int [] arr,int i,int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr,i+1,key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the Element at index "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int i = firstOccurrence(arr,0,key);
        if (i >= 0) {
            System.out.println("The first occurrence of key is at index "+i);
        }
        else {
            System.out.println("key Not found in an Array");
        }
    }
}
