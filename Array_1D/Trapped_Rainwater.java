package Array_1D;

import java.util.Scanner;

public class Trapped_Rainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of bars: ");
        int num = sc.nextInt();
        int[] height = new int[num];
        for(int i=0; i<num; i++) {
            System.out.print("Enter the height of bar "+(i+1)+": ");
            height[i] = sc.nextInt();
        }
        int[] left_max = new int[num];
        int[] right_max = new int[num];
        left_max[0] = height[0];
        for(int i=1; i<num; i++) {
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }
        right_max[num-1] = height[num-1];
        for(int i=num-2; i>=0; i--) {
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }
        int trappedWater = 0;
        for(int i=0; i<num; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            trappedWater += water_level - height[i];
        }
        System.out.println("Total Trapped Water is "+trappedWater);
        sc.close();
    }
}
