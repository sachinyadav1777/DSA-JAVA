package Array_1D;

import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target Value: ");
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                for(int k = j+1; k<size; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        count++;
                    }
                }
            }
        }
        System.out.println("There are "+count+" Triplets in Array whose Sum is "+target);
        sc.close();
    }
}
