package Array_1D;

import java.util.Scanner;

public class SuffixSum {
    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length-1; i>0; i--){
            arr[i-1] = arr[i-1] + arr[i];
        }
        display(arr);
        sc.close();
    }
}
