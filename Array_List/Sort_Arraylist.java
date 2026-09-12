package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println("Arraylist Before Sorting:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Arraylist After Sorting:");
        System.out.println(list);
    }
}
