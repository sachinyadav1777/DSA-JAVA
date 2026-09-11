package Strings;

import java.util.Scanner;

public class Check_String_Palindrome {
    public static boolean stringChecker(String str) {
        int n = str.length();
        for(int i = 0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to check: ");
        String str = sc.nextLine();
        if(stringChecker(str)) {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given String is not Palindrome");
        }
    }
}
