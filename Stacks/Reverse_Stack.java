package Stacks;

import java.util.Stack;

public class Reverse_Stack {
    public static void pushAtBottom(Stack<Integer> s, int target) {
        if (s.isEmpty()) {
            s.push(target);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,target);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
