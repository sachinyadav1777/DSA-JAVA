package Array_List;

import java.util.ArrayList;

public class Pair_Sum_inSorted_Rotated_ArrayList {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int breakPt = -1;
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                breakPt = i;
                break;
            }
        }
        int left = breakPt + 1;
        int right = breakPt;
        int n = list.size();
        while(left != right) {
            if(list.get(left) + list.get(right) == target) {
                return true;
            }
            else if(list.get(left) + list.get(right) < target) {
                left = (left+1) % n;
            }
            else {
                right = (n+right-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        int target = 5;
        System.out.println(pairSum(list,target));
    }
}
