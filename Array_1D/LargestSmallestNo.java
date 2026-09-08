package Array_1D;

import java.util.Scanner;

public class LargestSmallestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] integers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array element "+(i+1)+": ");
            integers[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (integers[i] < smallest) {
                smallest = integers[i];
            }
            if (integers[i] > largest) {
                largest = integers[i];
            }
        }
        System.out.println("Largest Value is " + largest);
        System.out.println("Smallest Value is " + smallest);
        sc.close();
    }
}
