package Stacks;

import java.util.Stack;

public class Push_at_Bottom_of_Stack {
    public static void pushAtBottom(Stack<Integer> s, int target) {
        if (s.isEmpty()) {
            s.push(target);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,target);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        pushAtBottom(s,70);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
