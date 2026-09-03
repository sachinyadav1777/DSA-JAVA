package Strings;

import java.util.Scanner;

public class Print_Largest_String_From_Array {
    public static String largestString(String[] arr) {
        String largest = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of String Array: ");
        int size = sc.nextInt();
        String[] fruits = new String[size];
        for(int i = 0; i<size; i++) {
            System.out.print("Enter the String at Index "+i+": ");
            fruits[i] = sc.next();
        }
        System.out.println("Largest String in tha Array is "+largestString(fruits));
    }
}
