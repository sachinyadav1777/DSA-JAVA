package Array_1D;

import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<size; i++) {
            curr_sum = curr_sum + arr[i];
            max_sum = Math.max(curr_sum, max_sum);
            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        System.out.print("Maximum sum = "+max_sum);

        sc.close();
    }
}
