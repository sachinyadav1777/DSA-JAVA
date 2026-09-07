package Array_1D;

import java.util.Scanner;

public class OccurrenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Array Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to find: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("The occurrence of element " + num + " is " + count);
        sc.close();
    }
}
