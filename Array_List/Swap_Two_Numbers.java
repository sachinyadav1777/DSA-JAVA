package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap_Two_Numbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.print("Enter the first index: ");
        int idx1 = sc.nextInt();
        System.out.print("Enter the second index: ");
        int idx2 = sc.nextInt();
        System.out.println("Arraylist Before swapping:");
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println("Arraylist After swapping:");
        System.out.println(list);
    }
}
