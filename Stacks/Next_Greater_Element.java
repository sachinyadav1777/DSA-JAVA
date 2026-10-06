package Stacks;

import java.util.Stack;

public class Next_Greater_Element {
    public static int[] nextGraterElement(int[] arr) {
        int[] nextGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = s.peek();
            }
            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] result = nextGraterElement(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
