package Array_1D;

import java.util.Scanner;

public class MaximumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[size];
        prefix[0] = arr[0];
        for(int i=1; i<size; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        int sum;
        for(int i=0; i<size; i++) {
            for(int j=i; j<size; j++) {
                sum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(max<sum) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sum = "+max);
        sc.close();
    }
}
