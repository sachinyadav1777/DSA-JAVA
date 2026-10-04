package Stacks;

import java.util.ArrayList;

public class Stack_using_ArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.isEmpty();
        }
//        Push method
        public static void push(int data) {
            list.add(data);
        }
//        Pop method
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = list.getLast();
            list.removeLast();
            return top;
        }
//       Peek method
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.getLast();
        }
    }
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        System.out.println(Stack.peek());
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
