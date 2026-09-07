package Array_1D;

import java.util.Scanner;

public class Merge_Two_Arrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[m + n];
        int p1 = 0, p2 = 0;
        for(int idx = 0; idx < res.length; idx++) {
            int val1 = p1 == m ? Integer.MAX_VALUE : arr1[p1];
            int val2 = p2 == n ? Integer.MAX_VALUE : arr2[p2];
            if (val1 <= val2) {
                res[idx] = val1;
                p1++;
            }
            else {
                res[idx] = val2;
                p2++;
            }
        }
        return res;
    }
    public static void printArray(int[] arr) {
        for(int idx : arr) {
            System.out.print(idx+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the Array Element:");
        for(int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of an Array 2: ");
        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];
        System.out.println("Enter the Array Element:");
        for(int j = 0; j < size2; j++) {
            arr2[j] = sc.nextInt();
        }
        printArray(merge(arr1,arr2));
    }
}
