package Array_1D;

import java.util.Scanner;

public class PrintSubarrays {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter the array element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++) {
            for(int j=i; j<size; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
