package Array_1D;

import java.util.Scanner;

public class DuplicateCheck {
    public static boolean duplicateCheck(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicateCheck(arr));
        sc.close();
    }
}
