package Backtracking;

import java.util.Scanner;

public class Find_All_Permutations {
    public static void printAllPermutation(String str,StringBuilder ans) {
        if (str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String test = str.substring(0,i) + str.substring(i+1);
            printAllPermutation(test,ans.append(curr));
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        StringBuilder ans = new StringBuilder();
        printAllPermutation(str,ans);
    }
}
