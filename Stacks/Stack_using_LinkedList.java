package Stacks;

public class Stack_using_LinkedList {
    public static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        static Node head = null;
//      isEmpty method
        public static boolean isEmpty() {
            return head == null;
        }
//        Push method
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
//        Pop method
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
//        Peek method
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
