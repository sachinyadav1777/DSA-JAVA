package Backtracking;

import java.util.Scanner;

public class Find_Subsets {
    public static void findSubsets(String str,int i,StringBuilder ans) {
        if (i == str.length()) {
            System.out.print(ans+" ");
            return;
        }
        findSubsets(str,i+1,ans.append(str.charAt(i)));
        ans.deleteCharAt(ans.length()-1);
        findSubsets(str,i+1,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        System.out.print("Enter the String: ");
        String str = sc.next();
        findSubsets(str,0,ans);
    }
}
