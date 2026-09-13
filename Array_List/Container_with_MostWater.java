package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Container_with_MostWater {
    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;
        int si = 0;
        int ei = list.size()-1;
        while(si < ei) {
            int height = Math.min(list.get(si),list.get(ei));
            int width = ei-si;
            int currWater = height * width;
            maxWater = Math.max(maxWater,currWater);
            if(list.get(si) < list.get(ei)) {
                si++;
            }
            else {
                ei--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            System.out.print("Do you want to enter element in list (y/n): ");
            String str = sc.next();
            if(str.equalsIgnoreCase("y")) {
                System.out.print("Enter the Element: ");
                int num = sc.nextInt();
                list.add(num);
            }
            else {
                break;
            }
        }
        System.out.println("Total Water = "+ storeWater(list));
    }
}
