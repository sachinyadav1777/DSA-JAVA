package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Multi_Dimensional_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        while(true) {
            System.out.print("Do you want to enter element in list1(y/n): ");
            String str = sc.next();
            if(str.equalsIgnoreCase("y")) {
                System.out.print("Enter the Element: ");
                int num = sc.nextInt();
                list1.add(num);
            }
            else {
                break;
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        while(true) {
            System.out.print("Do you want to enter element in list2(y/n): ");
            String str = sc.next();
            if(str.equalsIgnoreCase("y")) {
                System.out.print("Enter the Element: ");
                int num = sc.nextInt();
                list2.add(num);
            }
            else {
                break;
            }
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        while(true) {
            System.out.print("Do you want to enter element in list3(y/n): ");
            String str = sc.next();
            if(str.equalsIgnoreCase("y")) {
                System.out.print("Enter the Element: ");
                int num = sc.nextInt();
                list3.add(num);
            }
            else {
                break;
            }
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(mainList);
    }
}
